package me.qingy.project.metrics.v1;

import java.util.List;
import java.util.Map;

/**
 * @author qingy
 * @since 2021/7/19
 */
public class RedisMetricsStorage implements MetricsStorage {

    //... 省略属性和构造函数等...

    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        //...
    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        //...
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        //...
        return null;
    }
}