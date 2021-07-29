package me.qingy.dp.creational.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * 深拷贝：递归拷贝对象
 * 问题：每个对象都用深拷贝，性能与空间占用都有很大损耗
 *
 * @author qingy
 * @since 2021-07-29
 */
public class DemoV3 {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        // Deep copy
        HashMap<String, SearchWord> newKeywords = new HashMap<>();
        for (HashMap.Entry<String, SearchWord> e : currentKeywords.entrySet()) {
            SearchWord searchWord = e.getValue();
            SearchWord newSearchWord = new SearchWord(searchWord.getKeyword(), searchWord.getCount(), searchWord.getLastUpdateTime());
            newKeywords.put(e.getKey(), newSearchWord);
        }
        // 从数据库中取出更新时间 >lastUpdateTime 的数据，放入到 newKeywords 中
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
