package me.qingy.dp.behavioral.observer.p2p;

/**
 * @author qingy
 * @since 2021-08-04
 */
public interface NotificationService {
    void sendInboxMessage(long userId, String s);
}
