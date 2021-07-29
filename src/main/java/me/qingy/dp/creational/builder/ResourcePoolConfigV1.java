package me.qingy.dp.creational.builder;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * 现在构造方法中只有4个参数，3个为可选配置项，如果再加参数，校验+赋值会使构造方法变的相当冗长
 * 而且参数太多，导致可读性差、参数可能传递错误
 * ResourcePoolConfig config = new ResourcePoolConfig("dbconnectionpool", 16, null, 8, null, false, true, 10, 20, false, true);
 *
 * @author qingy
 * @since 2021-07-29
 */
@Data
public class ResourcePoolConfigV1 {
    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

    private String name;
    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_IDLE;

    public ResourcePoolConfigV1(String name, Integer maxTotal, Integer maxIdle, Integer minIdle) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty.");
        }
        this.name = name;

        if (maxTotal != null) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("maxTotal should be positive.");
            }
            this.maxTotal = maxTotal;
        }

        if (maxIdle != null) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("maxIdle should not be negative.");
            }
            this.maxIdle = maxIdle;
        }

        if (minIdle != null) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("minIdle should not be negative.");
            }
            this.minIdle = minIdle;
        }
    }
}