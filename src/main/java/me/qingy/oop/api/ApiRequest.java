package me.qingy.oop.api;

import lombok.Data;

/**
 * @author qingy
 * @since 2021/6/8
 */
@Data
public class ApiRequest {

    private String originalUrl;
    private String appId;
    private Long timestamp;
    private String token;

    public static ApiRequest buildFromUrl(String url) {
        // url -> originalUrl appId timestamp token
        return new ApiRequest();
    }
}
