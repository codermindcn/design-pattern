package me.qingy.principle.ocp.ocp.handler;

import me.qingy.principle.ocp.normal.AlertRule;
import me.qingy.principle.ocp.normal.Notification;
import me.qingy.principle.ocp.ocp.ApiStatInfo;

/**
 * @author qingy
 * @since 2021/6/8
 */
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
