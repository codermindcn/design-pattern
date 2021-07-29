package me.qingy.dp.creational.prototype;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 需求：更新缓存中的数据
 *
 * @author qingy
 * @since 2021-07-29
 */
public class DemoV1 {
    private final ConcurrentHashMap<String, SearchWord> currentKeywords = new ConcurrentHashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        // 从数据库中取出更新时间 >lastUpdateTime 的数据，放入到 currentKeywords 中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        if (Objects.isNull(toBeUpdatedSearchWords)) return;

        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            if (currentKeywords.containsKey(searchWord.getKeyword())) {
                currentKeywords.replace(searchWord.getKeyword(), searchWord);
            } else {
                currentKeywords.put(searchWord.getKeyword(), searchWord);
            }
        }

        lastUpdateTime = maxNewUpdatedTime;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // 从数据库中取出更新时间 >lastUpdateTime 的数据
        return null;
    }
}
