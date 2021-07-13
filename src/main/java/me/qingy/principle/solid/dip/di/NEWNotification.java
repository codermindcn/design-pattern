package me.qingy.principle.solid.dip.di;

/**
 * 非依赖注入
 *
 * @author qingy
 * @since 2021/6/9
 */
public class NEWNotification {
    private MessageSender messageSender;

    public NEWNotification() {
        this.messageSender = new MessageSender(); // 此处有点像 hardcode
    }

    public void sendMessage(String cellphone, String message) {
        //... 省略校验逻辑等...
        this.messageSender.send(cellphone, message);
    }

    public static void main(String[] args){
        NEWNotification notification = new NEWNotification();
    }

    public static class MessageSender {
        public void send(String cellphone, String message) {
            //....
        }
    }
}
