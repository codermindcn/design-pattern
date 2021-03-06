package me.qingy.project.metrics.v3;

import com.google.common.annotations.VisibleForTesting;
import me.qingy.project.metrics.v1.MetricsStorage;
import me.qingy.project.metrics.v1.RedisMetricsStorage;
import me.qingy.project.metrics.v2.Aggregator;
import me.qingy.project.metrics.v2.EmailViewer;
import me.qingy.project.metrics.v2.StatViewer;

import java.util.*;

/**
 * @author qingy
 * @since 2021-07-27
 */
public class EmailReporter extends ScheduledReporter {

    private static final Long DAY_HOURS_IN_SECONDS = 86400L;

    // 兼顾代码的易用性，新增一个封装了默认依赖的构造函数
    public EmailReporter(List<String> emailToAddresses) {
        this(new RedisMetricsStorage(), new Aggregator(), new EmailViewer(emailToAddresses));
    }

    // 兼顾灵活性和代码的可测试性，这个构造函数继续保留
    public EmailReporter(MetricsStorage metricsStorage, Aggregator aggregator, StatViewer viewer) {
        super(metricsStorage, aggregator, viewer);
    }

    public void startDailyReport() {
        Date firstTime = trimTimeFieldsToZeroOfNextDay(new Date());
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                long durationInMillis = DAY_HOURS_IN_SECONDS * 1000;
                long endTimeInMillis = System.currentTimeMillis();
                long startTimeInMillis = endTimeInMillis - durationInMillis;
                doStatAndReport(startTimeInMillis, endTimeInMillis);
            }
        }, firstTime, DAY_HOURS_IN_SECONDS * 1000);
    }

    @VisibleForTesting
    protected Date trimTimeFieldsToZeroOfNextDay(Date date) { // 解决强依赖系统时间问题，将强依赖的时间传进来
        Calendar calendar = Calendar.getInstance(); // 这里可以获取当前时间
        calendar.setTime(date); // 重新设置时间
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}
