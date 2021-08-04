package me.qingy.dp.behavioral.observer.event_bus_wheel;

import java.util.concurrent.Executor;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class AsyncEventBus extends EventBus {
    // 由调用者注入线程池
    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
