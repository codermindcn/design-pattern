package me.qingy.principle.solid.ocp.ocp.handler;

import me.qingy.principle.solid.ocp.normal.AlertRule;
import me.qingy.principle.solid.ocp.normal.Notification;
import me.qingy.principle.solid.ocp.normal.NotificationEmergencyLevel;
import me.qingy.principle.solid.ocp.ocp.ApiStatInfo;

/**
 * @author qingy
 * @since 2021/6/8
 */
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
