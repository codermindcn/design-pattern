package me.qingy.principle.isp;

/**
 * @author qingy
 * @since 2021/6/9
 */
public class KafkaConfig implements Updater{

    private ConfigSource configSource;

    public KafkaConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    //... 省略...
    @Override
    public void update() {

    }
}
