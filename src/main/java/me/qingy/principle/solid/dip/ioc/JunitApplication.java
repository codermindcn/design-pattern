package me.qingy.principle.solid.dip.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板设计模式实现控制反转，框架控制了执行流程。
 *
 * @author qingy
 * @since 2021/6/9
 */
public class JunitApplication {
    private static final List<TestCase> testCases = new ArrayList<>();

    public static void register(TestCase testCase) {
        testCases.add(testCase);
    }

    public static final void main(String[] args) {
        // 注册操作还可以通过配置的方式来实现，不需要程序员显示调用 register()
        JunitApplication.register( new IOCUserServiceTest());

        for (TestCase testCase : testCases) {
            testCase.run();
        }
    }
}
