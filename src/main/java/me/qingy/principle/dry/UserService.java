package me.qingy.principle.dry;

/**
 * 代码执行重复
 *
 * 1. email 的校验执行了两次
 * 2. 不需要执行 checkIfUserExisted()，直接 getUserByEmail() 判空
 *
 * @author qingy
 * @since 2021/6/10
 */
public class UserService {
    private UserRepo userRepo; // 通过依赖注入或者 IOC 框架注入

    public User login(String email, String password) {
        boolean existed = userRepo.checkIfUserExisted(email, password);
        if (!existed) {
            // ... throw AuthenticationFailureException...
            User user = userRepo.getUserByEmail(email);
            return user;
        }
        return null;
    }

    public static class User {}
}

