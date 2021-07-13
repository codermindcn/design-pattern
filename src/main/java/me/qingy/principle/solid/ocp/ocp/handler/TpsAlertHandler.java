package me.qingy.principle.solid.ocp.ocp.handler;

import me.qingy.principle.solid.ocp.normal.AlertRule;
import me.qingy.principle.solid.ocp.normal.Notification;
import me.qingy.principle.solid.ocp.normal.NotificationEmergencyLevel;
import me.qingy.principle.solid.ocp.ocp.ApiStatInfo;

/**
 * @author qingy
 * @since 2021/6/8
 */
public class TpsAlertHandler extends AlertHandler {
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
