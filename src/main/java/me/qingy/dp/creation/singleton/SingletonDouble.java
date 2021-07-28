package me.qingy.dp.creation.singleton;

import java.util.Objects;

/**
 * 双重检测
 * 线程安全，支持延迟加载，也支持高并发
 *
 * @author qingy
 * @since 2021/7/28
 */
public class SingletonDouble {
    /**
     * 高版本 JDK 内部已经解决指令重排序问题，不需要加 volatile，解决方式是内部将 new 操作与初始化操作设计为原子操作
     */
    private static SingletonDouble instance;

    private SingletonDouble() {
    }

    public static SingletonDouble getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (SingletonDouble.class) {
                if (Objects.isNull(instance)) {
                    instance = new SingletonDouble();
                }
            }
        }
        return instance;
    }
}
