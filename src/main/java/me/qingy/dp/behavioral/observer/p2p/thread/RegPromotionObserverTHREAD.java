package me.qingy.dp.behavioral.observer.p2p.thread;

import me.qingy.dp.behavioral.observer.p2p.PromotionService;
import me.qingy.dp.behavioral.observer.p2p.RegObserver;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class RegPromotionObserverTHREAD implements RegObserver {
    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(long userId) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                promotionService.issueNewUserExperienceCash(userId);
            }
        });
        thread.start();
    }

}
