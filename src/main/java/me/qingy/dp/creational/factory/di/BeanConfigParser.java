package me.qingy.dp.creational.factory.di;

import java.io.InputStream;
import java.util.List;

/**
 * @author qingy
 * @since 2021-07-28
 */
public interface BeanConfigParser {
    List<BeanDefinition> parse(InputStream inputStream);
}
