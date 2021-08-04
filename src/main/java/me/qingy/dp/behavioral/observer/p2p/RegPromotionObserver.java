package me.qingy.dp.behavioral.observer.p2p;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
