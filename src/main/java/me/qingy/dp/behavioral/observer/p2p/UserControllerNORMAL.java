package me.qingy.dp.behavioral.observer.p2p;

/**
 * @author qingy
 * @since 2021-08-04
 */
public class UserControllerNORMAL {
    private UserService userService; // 依赖注入
    private PromotionService promotionService; // 依赖注入

    public Long register(String telephone, String password) {
        // 省略输入参数的校验代码
        // 省略 userService.register() 异常的 try-catch 代码

        // 违反单一职责原则，但如果没有扩展或修改的需求也是可以接受的，毕竟引入观察者模式就会引入更多的类和代码结构复杂度
        // 需求：用户注册成功之后，不再发放体验金，而是改为发放优惠券，并且还要给用户发送一封“欢迎注册成功”的站内信。
        // 这时随着新需求的实现就会违法开闭原则，并且如果注册成功后的操作越来越多，方法中的逻辑势必越来越复杂，影响可读性和可维护性
        long userId = userService.register(telephone, password);
        promotionService.issueNewUserExperienceCash(userId);
        return userId;
    }
}
