package me.qingy.dp.structural.bridge;

import java.util.List;

/**
 * @author qingy
 * @since 2021-08-02
 */
public class EmailMsgSender implements MsgSender {

    private List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {
        //...
    }
}
