package me.qingy.dp.creational.factory.factory_method;

import me.qingy.dp.creational.factory.factory_method.impl.JsonRuleConfigParserFactory;
import me.qingy.dp.creational.factory.factory_method.impl.PropertiesRuleConfigParserFactory;
import me.qingy.dp.creational.factory.factory_method.impl.XmlRuleConfigParserFactory;
import me.qingy.dp.creational.factory.factory_method.impl.YamlRuleConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂方法的简单工厂...
 * 因为工厂类只包含方法，不包含成员变量，完全可以复用，
 * 不需要每次都创建新的工厂类对象，所以，简单工厂模式的第二种实现思路更加合适。
 *
 * @author qingy
 * @since 2021-07-28
 */
public class RuleConfigParserFactoryMap {
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
        cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        IRuleConfigParserFactory parserFactory = cachedFactories.get(type.toLowerCase());
        return parserFactory;
    }
}
