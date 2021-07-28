package me.qingy.dp.creational.singleton;

import java.util.Objects;

/**
 * 懒汉式
 * 缺点：方法级别的同步锁，获取实例串行化，并发度低（1），性能差
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
