package me.qingy.dp.behavioral.strategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author qingy
 * @since 2021/8/5
 */
public class Application {
    private Strategy strategy;

    public Application(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("config.properties"));
        String type = props.getProperty("strategy_type");
        Strategy strategy = StrategyFactoryMAP.getStrategy(type);
        Application application = new Application(strategy);
    }
}
