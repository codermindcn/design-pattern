package me.qingy.oop.api;

/**
 * @author qingy
 * @since 2021/6/8
 */
public class AuthToken {

    public static AuthToken generate(String originalUrl, String appId, String password, long timestamp) {
        // 相同算法生成 token
        return new AuthToken();
    }

    public boolean match(AuthToken clientAuthToken) {
        return true;
    }
}
