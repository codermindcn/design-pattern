package me.qingy.project.metrics.v2;

import com.google.gson.Gson;
import me.qingy.project.metrics.v1.RequestStat;

import java.util.Map;

/**
 * @author qingy
 * @since 2021-07-26
 */
public class ConsoleViewer implements StatViewer {
    public void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {
        System.out.println("Time Span: [" + startTimeInMillis + ", " + endTimeInMills + "]");
        Gson gson = new Gson();
        System.out.println(gson.toJson(requestStats));
    }
}
