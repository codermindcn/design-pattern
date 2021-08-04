package me.qingy.dp.behavioral.observer.p2p;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class UserControllerOBSERVER {
    private UserService userService; // 依赖注入
    private List<RegObserver> regObservers = new ArrayList<>();

    // 一次性设置好，之后也不可能动态的修改
    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }

    public Long register(String telephone, String password) {
        // 省略输入参数的校验代码
        // 省略 userService.register() 异常的 try-catch 代码
        long userId = userService.register(telephone, password);
        for (RegObserver observer : regObservers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}
