package me.qingy.principle.solid.ocp.normal;

import lombok.Setter;

import java.util.List;

/**
 * 告警通知
 *
 * @author qingy
 * @since 2021-06-08
 */
@Setter
public class Notification {

    private List<String> emailAddresses;
    private List<String> telephones;
    private List<String> wechatIds;

    public void notify(NotificationEmergencyLevel level, String message) {
        if (level.equals(NotificationEmergencyLevel.SEVERE)) {
            //...自动语音电话
        } else if (level.equals(NotificationEmergencyLevel.URGENCY)) {
            //...发微信
        } else if (level.equals(NotificationEmergencyLevel.NORMAL)) {
            //...发邮件
        } else if (level.equals(NotificationEmergencyLevel.TRIVIAL)) {
            //...发邮件
        }
    }
}
