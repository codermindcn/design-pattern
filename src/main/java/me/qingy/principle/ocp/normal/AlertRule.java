package me.qingy.principle.ocp.normal;

/**
 * 告警规则
 *
 * @author qingy
 * @since 2021-06-08
 */
public class AlertRule {

    private static final Long MAX_TPS = 0L;
    private static final Long MAX_ERROR_COUNT = 0L;
    private static final Long MAX_TIMEOUT_TPS = 0L;

    public AlertRule getMatchedRule(String api) {
        // 应该不同 api 会有不同的告警规则
        return new AlertRule();
    }

    public long getMaxTps() {
        return MAX_TPS;
    }

    public long getMaxErrorCount() {
        return MAX_ERROR_COUNT;
    }

    public long getMaxTimeoutTps() {
        return MAX_TIMEOUT_TPS;
    }
}
