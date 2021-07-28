package me.qingy.dp.creational.factory.factory_method;

import me.qingy.dp.creational.factory.easy_factory.IRuleConfigParser;

/**
 * @author qingy
 * @since 2021-07-28
 */
public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
