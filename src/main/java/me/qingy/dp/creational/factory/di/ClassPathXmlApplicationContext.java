package me.qingy.dp.creational.factory.di;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 执行入口，组装 BeansFactory 和 BeanConfigParser，串联执行流程
 *
 * @author qingy
 * @since 2021-07-28
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {

    private BeansFactory beansFactory;
    private BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext(String configLocation) {
        this.beansFactory = new BeansFactory();
        this.beanConfigParser = new XmlBeanConfigParser();
        loadBeanDefinitions(configLocation);
    }

    private void loadBeanDefinitions(String configLocation) {
        try (InputStream in =this.getClass().getResourceAsStream(configLocation)){
            if (in == null) {
                throw new RuntimeException(("Can not find config file: " + configLocation));
            }

            List<BeanDefinition> beanDefinitions = beanConfigParser.parse(in);
            beansFactory.addBeanDefinitions(beanDefinitions);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanId) {
        return beansFactory.getBean(beanId);
    }
}
