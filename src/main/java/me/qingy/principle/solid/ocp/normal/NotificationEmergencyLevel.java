package me.qingy.principle.solid.ocp.normal;

/**
 * 通知的紧急程度
 *
 * @author qingy
 * @since 2021-06-08
 */
public enum NotificationEmergencyLevel {
    /**
     * 严重
     */
    SEVERE,
    /**
     * 紧急
     */
    URGENCY,
    /**
     * 普通
     */
    NORMAL,
    /**
     * 无关紧要
     */
    TRIVIAL;
}
