package me.qingy.dp.behavioral.observer.p2p.event_bus;

import com.google.common.eventbus.Subscribe;
import me.qingy.dp.behavioral.observer.p2p.NotificationService;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class RegNotificationObserver {
    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }
}
