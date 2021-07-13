package me.qingy.principle.solid.ocp.ocp;

import me.qingy.principle.solid.ocp.normal.AlertRule;
import me.qingy.principle.solid.ocp.normal.Notification;
import me.qingy.principle.solid.ocp.ocp.handler.ErrorAlertHandler;
import me.qingy.principle.solid.ocp.ocp.handler.TimeoutAlertHandler;
import me.qingy.principle.solid.ocp.ocp.handler.TpsAlertHandler;

/**
 * ApplicationContext 是一个单例类，负责 Alert 的创建、组装(alertRule 和 notification 的依赖注入)、初始化(添加 handlers)工作。
 *
 * @author qingy
 * @since 2021/6/8
 */
public class ApplicationContext {
    private AlertRule alertRule;
    private Notification notification;
    private Alert alert;

    public void initializeBeans() {
        alertRule = new AlertRule(/*. 省略参数.*/); // 省略一些初始化代码
        notification = new Notification(/*. 省略参数.*/); // 省略一些初始化代码
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule, notification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule, notification));
        // 扩展改动三
        alert.addAlertHandler(new TimeoutAlertHandler(alertRule, notification));
    }

    public Alert getAlert() {
        return alert;
    }

    /**
     * 饿汉式单例
     */
    private static final ApplicationContext INSTANCE = new ApplicationContext();

    private ApplicationContext() {
        INSTANCE.initializeBeans();
    }

    public static ApplicationContext getInstance() {
        return INSTANCE;
    }
}
