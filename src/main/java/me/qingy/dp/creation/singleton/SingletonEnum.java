package me.qingy.dp.creation.singleton;

/**
 * 枚举
 * 通过枚举类的特性保证了实例创建过程中的线程安全性以及实例的唯一性
 *
 * @author qingy
 * @since 2021/7/28
 */
public enum SingletonEnum {
    INSTANCE;
}
