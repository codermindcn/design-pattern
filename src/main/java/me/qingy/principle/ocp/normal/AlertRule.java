package me.qingy.principle.ocp.normal;

/**
 * 告警规则
 *
 * @author qingy
 * @since 2021-06-08
 */
public class AlertRule {
    public AlertRule getMatchedRule(String api) {
        return new AlertRule();
    }

    public long getMaxTps() {
        return 0L;
    }

    public long getMaxErrorCount() {
        return 0L;
    }

    public long getMaxTimeoutTps() {
        return 0L;
    }
}
