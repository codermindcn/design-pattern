package me.qingy.principle.isp;

import java.util.Map;

/**
 * @author qingy
 * @since 2021/6/9
 */
public class MysqlConfig implements Viewer{

    private ConfigSource configSource;

    public MysqlConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map<String, String> output() {
        return null;
    }
    //... 省略...
}
