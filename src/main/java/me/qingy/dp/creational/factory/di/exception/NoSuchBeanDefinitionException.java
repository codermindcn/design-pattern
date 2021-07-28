package me.qingy.dp.creational.factory.di.exception;

/**
 * @author qingy
 * @since 2021-07-28
 */
public class NoSuchBeanDefinitionException extends RuntimeException {
    public NoSuchBeanDefinitionException(String message) {
        super(message);
    }
}
