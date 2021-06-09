package me.qingy.principle.isp;

import java.util.Map;

/**
 * 配置信息展示
 *
 * @author qingy
 * @since 2021/6/9
 */
public interface Viewer {
    String outputInPlainText();

    Map<String, String> output();
}
