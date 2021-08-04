package me.qingy.dp.behavioral.observer.base;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class ConcreteObserverOne implements Observer {
    @Override
    public void update(Message message) {
        // 获取消息通知，执行自己的逻辑...
        System.out.println("ConcreteObserverOne is notified.");
    }
}

