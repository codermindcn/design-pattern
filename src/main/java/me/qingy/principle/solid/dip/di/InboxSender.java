package me.qingy.principle.solid.dip.di;

/**
 * 站内信息
 *
 * @author qingy
 * @since 2021/6/10
 */
public class InboxSender implements MessageSender {
    @Override
    public void send(String cellphone, String message) {
        //....
    }
}
