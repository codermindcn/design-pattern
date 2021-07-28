package me.qingy.dp.creational.factory.factory_method.impl;

import me.qingy.dp.creational.factory.easy_factory.IRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.XmlRuleConfigParser;
import me.qingy.dp.creational.factory.factory_method.IRuleConfigParserFactory;

/**
 * @author qingy
 * @since 2021-07-28
 */
public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
