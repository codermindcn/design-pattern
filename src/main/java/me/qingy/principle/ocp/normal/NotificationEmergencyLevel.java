package me.qingy.principle.ocp.normal;

/**
 * 通知的紧急程度
 *
 * @author qingy
 * @since 2021-06-08
 */
public class NotificationEmergencyLevel {
    /**
     * 严重
     */
    public static final Integer SEVERE = 3;
    /**
     * 紧急
     */
    public static final Integer URGENCY = 2;
    /**
     * 普通
     */
    public static final Integer NORMAL = 1;
    /**
     * 无关紧要
     */
    public static final Integer TRIVIAL = 0;
}
