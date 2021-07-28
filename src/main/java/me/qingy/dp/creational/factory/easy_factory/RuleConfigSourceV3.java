package me.qingy.dp.creational.factory.easy_factory;

import me.qingy.dp.creational.factory.easy_factory.model.RuleConfig;

/**
 * 为了让类的职责更加单一、代码更加清晰，进一步将 createParser() 函数剥离到一个独立的类中，
 * 让这个类只负责对象的创建，也就是工厂类
 *
 * @author qingy
 * @since 2021-07-28
 */
public class RuleConfigSourceV3 {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        // 简单工厂
        IRuleConfigParser parser = RuleConfigParserSimpleFactoryMode2.createParser(ruleConfigFileExtension);

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
