package me.qingy.dp.behavioral.chain.ugc;

/**
 * @author qingy
 * @since 2021-08-05
 */
public class PoliticalWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;
        //...
        return legal;
    }
}
