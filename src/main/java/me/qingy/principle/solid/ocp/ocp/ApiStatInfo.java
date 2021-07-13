package me.qingy.principle.solid.ocp.ocp;

import lombok.Data;

/**
 * api 状态封装类
 *
 * @author qingy
 * @since 2021/6/8
 */
@Data
public class ApiStatInfo {
    private String apiName;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
    private long timeoutCount; // 扩展改动一

    public String getApi() {
        return apiName;
    }
}
