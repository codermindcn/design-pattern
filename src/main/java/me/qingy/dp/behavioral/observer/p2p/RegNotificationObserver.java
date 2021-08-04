package me.qingy.dp.behavioral.observer.p2p;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}