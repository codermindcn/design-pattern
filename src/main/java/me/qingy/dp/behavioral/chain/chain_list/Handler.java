package me.qingy.dp.behavioral.chain.chain_list;

/**
 * 处理器类 handle() 函数不仅包含自身的业务逻辑，还包含对下一个处理器的调用，添加新处理器时可能会忘记调用下一个处理器
 * 利用模板模式重构，将下一个处理器的调用放在抽象父类中，这样处理器就只需关注自身业务逻辑
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
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
