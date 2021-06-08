package me.qingy.principle.ocp.ocp;

import me.qingy.principle.ocp.ocp.handler.AlertHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingy
 * @since 2021/6/8
 */
public class Alert {
    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInfo);
        }
    }
}