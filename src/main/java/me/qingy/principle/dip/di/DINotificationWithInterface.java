package me.qingy.principle.dip.di;

/**
 * @author qingy
 * @since 2021/6/10
 */
public class DINotificationWithInterface {
    private MessageSender messageSender;

    // 通过构造函数将 messageSender 传递进来
    public DINotificationWithInterface(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String cellphone, String message) {
        //... 省略校验逻辑等...
        this.messageSender.send(cellphone, message);
    }

    public static void main(String[] args){
        SmsSender smsSender = new SmsSender();
        InboxSender inboxSender = new InboxSender();
        DINotificationWithInterface diNotification = new DINotificationWithInterface(smsSender);
    }
}
