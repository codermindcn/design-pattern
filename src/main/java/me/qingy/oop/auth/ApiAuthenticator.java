package me.qingy.oop.auth;

/**
 * @author qingy
 * @since 2021/6/8
 */
public interface ApiAuthenticator {
    void auth(String url);
    void auth(ApiRequest apiRequest);
}
