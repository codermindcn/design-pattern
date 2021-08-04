package me.qingy.dp.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 如果策略类是无状态的，不包含成员变量，只是纯粹的算法实现，这样的策略对象是可以被共享使用的
 * 那就可以事先创建好每个策略对象，缓存到工厂类中，用的时候直接返回。
 *
 * @author qingy
 * @since 2021-08-04
 */
public class StrategyFactoryMAP {
    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}
