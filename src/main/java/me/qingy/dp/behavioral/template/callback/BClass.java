package me.qingy.dp.behavioral.template.callback;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class BClass {
    public void process(ICallback callback) { // 回调函数注册入口
        //...
        callback.methodToCallback();
        //...
    }
}
