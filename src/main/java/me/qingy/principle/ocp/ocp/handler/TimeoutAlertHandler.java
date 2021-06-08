package me.qingy.principle.ocp.ocp.handler;

import me.qingy.principle.ocp.normal.AlertRule;
import me.qingy.principle.ocp.normal.Notification;
import me.qingy.principle.ocp.normal.NotificationEmergencyLevel;
import me.qingy.principle.ocp.ocp.ApiStatInfo;

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
