package me.qingy.dp.creational.factory.di.model;

/**
 * @author qingy
 * @since 2021-07-28
 */
public class RateLimiter {

    private RedisCounter redisCounter;

    public RateLimiter(RedisCounter redisCounter) {
        this.redisCounter = redisCounter;
    }

    public boolean isValid() {
        this.redisCounter.increaseAndGet();
        return true;
    }
}
