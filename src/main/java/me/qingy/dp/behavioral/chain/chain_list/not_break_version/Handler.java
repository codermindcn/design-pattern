package me.qingy.dp.behavioral.chain.chain_list.not_break_version;

/**
 * 变体：请求会被所有的处理器都处理一遍，不存在中途终止的情况
 *
 * @author qingy
 * @since 2021-08-05
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        doHandle();
        // 不再判断布尔，中途不会中止
        if (successor != null) {
            successor.handle();
        }
    }

    /**
     * 实现区别：处理器处理后不返回布尔
     */
    protected abstract void doHandle();
}
