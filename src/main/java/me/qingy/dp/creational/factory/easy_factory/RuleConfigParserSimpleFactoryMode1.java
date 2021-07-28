package me.qingy.dp.creational.factory.easy_factory;

import me.qingy.dp.creational.factory.easy_factory.impl.JsonRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.PropertiesRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.XmlRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.YamlRuleConfigParser;

/**
 * 简单工厂 实现方式1
 *
 * @author qingy
 * @since 2021-07-28
 */
public class RuleConfigParserSimpleFactoryMode1 {

    public static IRuleConfigParser createParser(String configFormat) {
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
