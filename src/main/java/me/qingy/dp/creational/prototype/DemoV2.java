package me.qingy.dp.creational.prototype;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/**
 * 原型模式：更新少量差值
 * 问题：Object.clone() 是浅拷贝，newKeywords 中依然无法保证数据是同一版本的
 *
 * @author qingy
 * @since 2021-07-29
 */
public class DemoV2 {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        // 原型模式就这么简单，拷贝已有对象的数据，更新少量差值
        HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) currentKeywords.clone();
        // 只捞出新增或者有更新的关键词，更新到 newKeywords 中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        if (Objects.isNull(toBeUpdatedSearchWords)) return;

        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if (newKeywords.containsKey(searchWord.getKeyword())) {
                SearchWord oldSearchWord = newKeywords.get(searchWord.getKeyword());
                oldSearchWord.setCount(searchWord.getCount());
                oldSearchWord.setLastUpdateTime(searchWord.getLastUpdateTime());
            } else {
                newKeywords.put(searchWord.getKeyword(), searchWord);
            }
        }
        lastUpdateTime = maxNewUpdatedTime;
        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // 从数据库中取出更新时间 >lastUpdateTime 的数据
        return null;
    }
}
