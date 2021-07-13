package me.qingy.principle.solid.ocp.ocp.handler;

import me.qingy.principle.solid.ocp.normal.AlertRule;
import me.qingy.principle.solid.ocp.normal.Notification;
import me.qingy.principle.solid.ocp.normal.NotificationEmergencyLevel;
import me.qingy.principle.solid.ocp.ocp.ApiStatInfo;

/**
 * 扩展改动二
 *
 * @author qingy
 * @since 2021/6/8
 */
public class TimeoutAlertHandler extends AlertHandler {

    public TimeoutAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long timeoutTps = apiStatInfo.getTimeoutCount() / apiStatInfo.getDurationOfSeconds();
        if (timeoutTps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTimeoutTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
