package me.qingy.dp.creational.factory.factory_method;

import me.qingy.dp.creational.factory.easy_factory.IRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.model.InvalidRuleConfigException;
import me.qingy.dp.creational.factory.easy_factory.model.RuleConfig;

/**
 * @author qingy
 * @since 2021-07-28
 */
public class RuleConfigSourceFactoryMethodPlus {
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        IRuleConfigParser parser = parserFactory.createParser();

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

