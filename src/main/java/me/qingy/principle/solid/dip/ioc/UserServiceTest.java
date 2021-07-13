package me.qingy.principle.solid.dip.ioc;

/**
 * 程序员自己控制整个程序的执行
 *
 * @author qingy
 * @since 2021/6/9
 */
public class UserServiceTest {
    public static boolean doTest() {
        // ...
        return true;
    }
    public static void main(String[] args) {
        // 这部分逻辑可以放到框架中 if (doTest()) {
        if (doTest()) {
            System.out.println("Test succeed.");
        } else {
            System.out.println("Test failed.");
        }
    }
}
