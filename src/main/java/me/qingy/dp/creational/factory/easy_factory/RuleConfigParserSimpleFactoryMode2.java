package me.qingy.dp.creational.factory.easy_factory;

import me.qingy.dp.creational.factory.easy_factory.impl.JsonRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.PropertiesRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.XmlRuleConfigParser;
import me.qingy.dp.creational.factory.easy_factory.impl.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂 实现方式2
 *
 * @author qingy
 * @since 2021-07-28
 */
public class RuleConfigParserSimpleFactoryMode2 {

    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null; // 返回null还是IllegalArgumentException全凭你自己说了算
        }
        IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }

}
