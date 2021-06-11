package me.qingy.principle.dry;

/**
 * 代码执行重复
 *
 *
 * @author qingy
 * @since 2021/6/10
 */
public class UserRepo {

    public boolean checkIfUserExisted(String email, String password) {
        // 校验 email
        if (!EmailValidation.validate(email)) {
            // ... throw InvalidEmailException...
        }
        if (!PasswordValidation.validate(password)) {
            // ... throw InvalidPasswordException...
        }
        //...query db to check if email&password exists...
        return true;
    }

    public UserService.User getUserByEmail(String email) {
        // 校验 email
        if (!EmailValidation.validate(email)) {
            // ... throw InvalidEmailException...
        }
        //...query db to get user by email...
        return null;
    }

    public static class EmailValidation {
        public static boolean validate(String email) {
            return true;
        }
    }
    public static class PasswordValidation {
        public static boolean validate(String password) {
            return true;
        }
    }
}
