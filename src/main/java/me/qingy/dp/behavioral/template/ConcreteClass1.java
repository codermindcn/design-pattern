package me.qingy.dp.behavioral.template;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void method1() {
        //...
    }

    @Override
    protected void method2() {
        //...
    }

    public static void main(String[] args){
        AbstractClass demo = new ConcreteClass1();
        demo.templateMethod();
    }
}
