package me.qingy.dp.behavioral.chain.chain_list.v0;

/**
 * 坏味道版本：处理器处理逻辑耦合自身业务及调用下一个处理器
 *
 * @author qingy
 * @since 2021-08-05
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}
