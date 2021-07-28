package me.qingy.dp.creational.factory.easy_factory;

import me.qingy.dp.creational.factory.easy_factory.impl.JsonRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.PropertiesRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.XmlRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.YamlRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.model.RuleConfig;

/**
 * @author qingy
 * @since 2021-07-28
 */
public class RuleConfigSourceV2 {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        IRuleConfigParser parser = createParser(ruleConfigFileExtension);

        String configText = "";
        // 从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        // ...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }

    /**
     * 将功能独立的代码块封装成函数，代码逻辑更清晰，提升可读性
     */
    private IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}
