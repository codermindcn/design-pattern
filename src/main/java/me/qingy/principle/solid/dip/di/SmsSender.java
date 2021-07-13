package me.qingy.principle.solid.dip.di;

/**
 * 短信
 *
 * @author qingy
 * @since 2021/6/10
 */
public class SmsSender implements MessageSender {
    @Override
    public void send(String cellphone, String message) {
        //....
    }
}
