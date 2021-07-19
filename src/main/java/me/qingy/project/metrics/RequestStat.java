package me.qingy.project.metrics;

import lombok.Data;

/**
 * @author qingy
 * @since 2021/7/19
 */
@Data
public class RequestStat {
    private double maxResponseTime;
    private double minResponseTime;
    private double avgResponseTime;
    private double p999ResponseTime;
    private double p99ResponseTime;
    private long count;
    private long tps;
}
