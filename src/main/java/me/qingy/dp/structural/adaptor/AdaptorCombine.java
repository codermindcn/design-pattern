package me.qingy.dp.structural.adaptor;

/**
 * 对象适配器：基于组合
 *
 * @author qingy
 * @since 2021-08-02
 */
public class AdaptorCombine implements ITarget {
    private Adaptee adaptee;

    public AdaptorCombine(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void f1() {
        adaptee.fa(); //委托给 Adaptee
    }

    public void f2() {
        //...重新实现f2()...
    }

    public void fc() {
        adaptee.fc();
    }
}
