package me.qingy.dp.creational.builder;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * 将构造方法中可选配置项参数校验与赋值剥离出来，通过构造方法设置必填项，set() 方法设置可选配置项
 * 问题：
 *  1. 诸如 name 的必填项增多，势必构造方法又会出现参数列表很长的问题，必填项用 set() 的话校验必填项是否已经填写的逻辑是无处安放的
 *  2. 配置项之间存在依赖关系，或约束条件（maxIdle < maxTotal），这些校验逻辑同样也无处安放
 *  3. 如果希望对象为不可变对象，创建之后不可再修改赋值，就不能暴露 set() 方法
 *
 * @author qingy
 * @since 2021-07-29
 */
@Data
public class ResourcePoolConfigV2 {
    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

    private String name;
    private int maxTotal = DEFAULT_MAX_TOTAL;
    private int maxIdle = DEFAULT_MAX_IDLE;
    private int minIdle = DEFAULT_MIN_IDLE;

    public ResourcePoolConfigV2(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name should not be empty.");
        }
        this.name = name;
    }

    public void setMaxTotal(int maxTotal) {
        if (maxTotal <= 0) {
            throw new IllegalArgumentException("maxTotal should be positive.");
        }
        this.maxTotal = maxTotal;
    }

    public void setMaxIdle(int maxIdle) {
        if (maxIdle < 0) {
            throw new IllegalArgumentException("maxIdle should not be negative.");
        }
        this.maxIdle = maxIdle;
    }

    public void setMinIdle(int minIdle) {
        if (minIdle < 0) {
            throw new IllegalArgumentException("minIdle should not be negative.");
        }
        this.minIdle = minIdle;
    }

    public static void main(String[] args){
        ResourcePoolConfigV2 config = new ResourcePoolConfigV2("db-pool");
        config.setMaxTotal(8);
        config.setMinIdle(8);
    }
}