package me.qingy.dp.creational.prototype;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 需求：缓存中的数据需统一版本
 * 实现：不直接在旧版本上更新，而是拉取新版本数据，再一次性将旧版本数据替换掉
 * 问题：10 万条数据从数据库中读出，然后计算哈希值，构建 newKeywords，相当耗时，这时需要使用原型模式
 *
 * @author qingy
 * @since 2021-07-29
 */
public class DemoV2Temp {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        HashMap<String, SearchWord> newKeywords = new LinkedHashMap<>();
        // 从数据库中取出所有的数据，放入到newKeywords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        if (Objects.isNull(toBeUpdatedSearchWords)) return;

        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            newKeywords.put(searchWord.getKeyword(), searchWord);
        }
        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // 从数据库中取出更新时间 >lastUpdateTime 的数据
        return null;
    }
}
