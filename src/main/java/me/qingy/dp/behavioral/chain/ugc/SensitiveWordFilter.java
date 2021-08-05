package me.qingy.dp.behavioral.chain.ugc;

/**
 * @author qingy
 * @since 2021-08-05
 */
public interface SensitiveWordFilter {
    boolean doFilter(Content content);
}

