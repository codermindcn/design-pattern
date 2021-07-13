package me.qingy.principle.solid.dip.ioc;

/**
 * @author qingy
 * @since 2021/6/9
 */
public abstract class TestCase {

    public void run() {
        if (doTest()) {
            System.out.println("Test succeed.");
        } else {
            System.out.println("Test failed.");
        }
    }

    public abstract boolean doTest();
}
