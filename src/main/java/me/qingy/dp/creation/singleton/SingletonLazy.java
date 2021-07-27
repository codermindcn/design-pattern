package me.qingy.dp.creation.singleton;

import java.util.Objects;

/**
 * 懒汉式
 * 缺点：并发度低（1），串行化，性能差
 *
 * @author qingy
 * @since 2021/7/28
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
