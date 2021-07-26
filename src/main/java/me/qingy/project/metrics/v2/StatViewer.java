package me.qingy.project.metrics.v2;

import me.qingy.project.metrics.v1.RequestStat;

import java.util.Map;

/**
 * @author qingy
 * @since 2021-07-26
 */
public interface StatViewer {
    void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills);
}
