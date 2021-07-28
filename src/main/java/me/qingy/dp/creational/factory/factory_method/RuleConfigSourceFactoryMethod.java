package me.qingy.dp.creational.factory.factory_method;

import me.qingy.dp.creational.factory.easy_factory.IRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.model.InvalidRuleConfigException;
import me.qingy.dp.creational.factory.easy_factory.model.RuleConfig;
import me.qingy.dp.creational.factory.factory_method.impl.JsonRuleConfigParserFactory;
import me.qingy.dp.creational.factory.factory_method.impl.PropertiesRuleConfigParserFactory;
import me.qingy.dp.creational.factory.factory_method.impl.XmlRuleConfigParserFactory;
import me.qingy.dp.creational.factory.factory_method.impl.YamlRuleConfigParserFactory;

/**
 * @author qingy
 * @since 2021-07-28
 */
public class RuleConfigSourceFactoryMethod {
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        IRuleConfigParserFactory parserFactory = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new JsonRuleConfigParserFactory();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new XmlRuleConfigParserFactory();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new YamlRuleConfigParserFactory();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new PropertiesRuleConfigParserFactory();
        } else {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        IRuleConfigParser parser = parserFactory.createParser();

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}
