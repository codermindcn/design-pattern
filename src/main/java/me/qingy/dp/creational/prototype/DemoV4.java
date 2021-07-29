package me.qingy.dp.creational.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * 只有需要更新的数据才用深拷贝
 *
 * @author qingy
 * @since 2021-07-29
 */
public class DemoV4 {
    private HashMap<String, SearchWord> currentKeywords = new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        // Shallow copy
        HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) currentKeywords.clone();
        // 从数据库中取出更新时间 >lastUpdateTime 的数据，放入到 newKeywords 中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        if (Objects.isNull(toBeUpdatedSearchWords)) return;

        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            // 需要更新的数据删除再加入，相当于深拷贝
            newKeywords.remove(searchWord.getKeyword());
            newKeywords.put(searchWord.getKeyword(), searchWord);
        }
        lastUpdateTime = maxNewUpdatedTime;
        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // 从数据库中取出更新时间 >lastUpdateTime 的数据
        return null;
    }
}
