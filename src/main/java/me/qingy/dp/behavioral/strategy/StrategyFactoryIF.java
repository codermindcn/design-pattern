package me.qingy.dp.behavioral.strategy;

/**
 * 如果策略类是有状态的，根据业务场景的需要，希望每次从工厂方法中获得的都是新创建的策略对象
 *
 * @author qingy
 * @since 2021-08-04
 */
public class StrategyFactoryIF {
    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        if (type.equals("A")) {
            return new ConcreteStrategyA();
        } else if (type.equals("B")) {
            return new ConcreteStrategyB();
        }

        return null;
    }
}
