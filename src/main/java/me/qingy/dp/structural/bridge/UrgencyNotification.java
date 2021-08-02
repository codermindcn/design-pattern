package me.qingy.dp.structural.bridge;

/**
 * @author qingy
 * @since 2021-08-02
 */
public class UrgencyNotification extends Notification {

    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }
    
    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
