package me.qingy.project.metrics.v1;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author qingy
 * @since 2021/7/19
 */
@Data
@AllArgsConstructor
public class RequestInfo {
    private String apiName;
    private double responseTime;
    private long timestamp;
}
