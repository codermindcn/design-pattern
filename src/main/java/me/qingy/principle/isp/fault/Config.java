package me.qingy.principle.isp.fault;

import java.util.Map;

/**
 * 违背接口隔离原则，不需要 update 或 viewer 功能的类还得强制实现
 *
 * @author qingy
 * @since 2021/6/9
 */
public interface Config {
    void update();

    String outputInPlainText();

    Map<String, String> output();
}
