package me.qingy.dp.creational.factory.factory_method.impl;

import me.qingy.dp.creational.factory.easy_factory.IRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.PropertiesRuleConfigParser;
import me.qingy.dp.creational.factory.factory_method.IRuleConfigParserFactory;

/**
 * @author qingy
 * @since 2021-07-28
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
