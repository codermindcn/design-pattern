package me.qingy.dp.behavioral.template.callback;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class AClass {
    public static void main(String[] args) {
        BClass b = new BClass();
        // 调用 B 类的函数，B 类反过来调用 A 类注册给他的函数
        b.process(new ICallback() { // 回调对象
            @Override
            public void methodToCallback() { // A 将回调函数注册到 B 类
                System.out.println("Call back me.");
            }
        });
    }
}
