package me.qingy.principle.solid.dip.di;

/**
 * 依赖注入
 *
 * @author qingy
 * @since 2021/6/10
 */
public class DINotification {
    private MessageSender messageSender;

    // 通过构造函数将 messageSender 传递进来
    public DINotification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String cellphone, String message) { //... 省略校验逻辑等...
        this.messageSender.send(cellphone, message);
    }

    public static void main(String[] args){
        MessageSender messageSender = new MessageSender();
        DINotification diNotification = new DINotification(messageSender);
    }

    public static class MessageSender {
        public void send(String cellphone, String message) {
            //....
        }
    }

}
