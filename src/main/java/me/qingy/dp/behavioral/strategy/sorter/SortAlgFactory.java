package me.qingy.dp.behavioral.strategy.sorter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qingy
 * @since 2021/8/5
 */
public class SortAlgFactory {
    private static final Map<String, ISortAlg> algs = new HashMap<>();

    // 隔离可变部分
    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return algs.get(type);
    }
}
