package me.qingy.dp.structural.bridge;

import java.util.List;

/**
 * @author qingy
 * @since 2021-08-02
 */
public class TelephoneMsgSender implements MsgSender {

    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        //...
    }
}
