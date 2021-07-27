package me.qingy.project.metrics.v3;

import me.qingy.project.metrics.v1.MetricsStorage;
import me.qingy.project.metrics.v1.RequestInfo;
import me.qingy.project.metrics.v1.RequestStat;
import me.qingy.project.metrics.v2.Aggregator;
import me.qingy.project.metrics.v2.StatViewer;

import java.util.List;
import java.util.Map;

/**
 * @author qingy
 * @since 2021-07-27
 */
public abstract class ScheduledReporter {
    protected MetricsStorage metricsStorage;
    protected Aggregator aggregator;
    protected StatViewer viewer;

    public ScheduledReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        this.metricsStorage = metricsStorage;
        this.aggregator = aggregator;
        this.viewer = viewer;
    }

    protected void doStatAndReport(long startTimeInMillis, long endTimeInMillis) {
        long durationInMillis = endTimeInMillis -  startTimeInMillis;
        Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);
        Map<String, RequestStat> requestStats = aggregator.aggregate(requestInfos, durationInMillis);
        viewer.output(requestStats, startTimeInMillis, endTimeInMillis);
    }

}
