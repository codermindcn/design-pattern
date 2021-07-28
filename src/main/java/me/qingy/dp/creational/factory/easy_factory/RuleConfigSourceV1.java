package me.qingy.dp.creational.factory.easy_factory;

import me.qingy.dp.creational.factory.easy_factory.impl.JsonRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.PropertiesRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.XmlRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.YamlRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.model.InvalidRuleConfigException;
import me.qingy.dp.creational.factory.easy_factory.model.RuleConfig;

/**
 * @author qingy
 * @since 2021-07-28
 */
public class RuleConfigSourceV1 {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        } else {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        // 从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        // ...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}
