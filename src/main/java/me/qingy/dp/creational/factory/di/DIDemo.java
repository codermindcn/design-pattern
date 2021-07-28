package me.qingy.dp.creational.factory.di;

import me.qingy.dp.creational.factory.di.model.RateLimiter;

/**
 * @author qingy
 * @since 2021-07-28
 */
public class DIDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
        boolean isValid = rateLimiter.isValid();
        System.out.println("RateLimiter call isValid method, result: " + isValid);
    }

}
