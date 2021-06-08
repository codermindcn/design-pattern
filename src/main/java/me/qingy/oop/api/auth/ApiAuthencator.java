package me.qingy.oop.api.auth;

/**
 * @author qingy
 * @since 2021/6/8
 */
public interface ApiAuthencator {
    void auth(String url);
    void auth(ApiRequest apiRequest);
}
