package me.qingy.dp.creational.factory.di.model;

import lombok.Data;

/**
 * @author qingy
 * @since 2021-07-28
 */
@Data
public class RedisCounter {

    private String ipAddress;
    private String port;

    public RedisCounter(String ipAddress, String port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public void increaseAndGet() {
        System.out.println("Connect to " + this.ipAddress + ":" + this.port);
    }
}
