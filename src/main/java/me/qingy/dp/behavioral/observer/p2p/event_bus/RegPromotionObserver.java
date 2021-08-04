package me.qingy.dp.behavioral.observer.p2p.event_bus;

import com.google.common.eventbus.Subscribe;
import me.qingy.dp.behavioral.observer.p2p.PromotionService;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class RegPromotionObserver {
    private PromotionService promotionService; // 依赖注入

    @Subscribe
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
