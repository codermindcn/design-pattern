package me.qingy.oop.auth;

/**
 * @author qingy
 * @since 2021/6/8
 */
public class AuthToken {

    public static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1 * 60 * 1000;
    private String token;
    private Long createTime;
    private Long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token, Long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, Long createTime, Long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public boolean isExpired(){
        return true;
    }

    public static AuthToken generate(String originalUrl, String appId, String password, long timestamp) {
        // 相同算法生成 token
        String token = "";
        return new AuthToken(token, timestamp);
    }

    public boolean match(AuthToken clientAuthToken) {
        return true;
    }
}
