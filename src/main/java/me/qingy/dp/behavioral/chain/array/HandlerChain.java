package me.qingy.dp.behavioral.chain.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingy
 * @since 2021-08-05
 */
public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}