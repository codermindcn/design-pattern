package me.qingy.dp.behavioral.chain.chain_list.v0;

/**
 * @author qingy
 * @since 2021-08-05
 */
public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
        System.out.println("HandlerB successor " + successor);
        System.out.println("HandlerB Method");
    }

    @Override
    public String toString() {
        return "HandlerB";
    }
}
