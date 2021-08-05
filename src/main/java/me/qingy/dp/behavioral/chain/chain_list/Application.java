package me.qingy.dp.behavioral.chain.chain_list;

/**
 * @author qingy
 * @since 2021-08-05
 */
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
