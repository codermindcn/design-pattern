package me.qingy.oop.api;

/**
 * @author qingy
 * @since 2021/6/8
 */
public interface ApiAuthencator {
    void auth(String url);
    void auth(ApiRequest apiRequest);
}
