package me.qingy.project.metrics;

import java.util.List;
import java.util.Map;

/**
 * 负责原始数据存储
 *
 * @author qingy
 * @since 2021/7/19
 */
public interface MetricsStorage {
    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}
