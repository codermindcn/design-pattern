package me.qingy.dp.creational.factory.easy_factory;

import me.qingy.dp.creational.factory.easy_factory.model.RuleConfig;

/**
 * @author qingy
 * @since 2021-07-28
 */
public interface IRuleConfigParser {
    RuleConfig parse(String configText);
}
