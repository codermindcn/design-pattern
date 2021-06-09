package me.qingy.principle.isp;

/**
 * @author qingy
 * @since 2021/6/9
 */
public class Application {
    static ConfigSource configSource = new ZookeeperConfigSource(/* 省略参数 */);
    public static final RedisConfig redisConfig = new RedisConfig(configSource);
    public static final KafkaConfig kafkaConfig = new KafkaConfig(configSource);
    public static final MysqlConfig mysqlConfig = new MysqlConfig(configSource);

    public static final ApiMetrics apiMetrics = new ApiMetrics();
    public static final DbMetrics dbMetrics = new DbMetrics();

    public static void main(String[] args) {
        ScheduledUpdater redisConfigUpdater = new ScheduledUpdater(redisConfig, 300, 300);
        redisConfigUpdater.run();
        ScheduledUpdater kafkaConfigUpdater = new ScheduledUpdater(kafkaConfig, 60, 60);
        kafkaConfigUpdater.run();

        SimpleHttpServer simpleHttpServer = new SimpleHttpServer("127.0.0.1", 6000);
        simpleHttpServer.addViewer("/config", redisConfig);
        simpleHttpServer.addViewer("/config", mysqlConfig);

        // 需要将性能统计也进行页面展示，只需要实现 Viewer 接口
        // 接口的粒度比较小，那涉及改动的类就比较少。
        simpleHttpServer.addViewer("/metrics", apiMetrics);
        simpleHttpServer.addViewer("/metrics", dbMetrics);
        simpleHttpServer.run();
    }
}
