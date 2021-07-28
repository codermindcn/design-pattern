package me.qingy.dp.creational.factory.di;

/**
 * @author qingy
 * @since 2021-07-28
 */
public interface ApplicationContext {
    Object getBean(String beanId);
}
