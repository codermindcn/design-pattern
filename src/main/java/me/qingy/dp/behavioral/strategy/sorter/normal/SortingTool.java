package me.qingy.dp.behavioral.strategy.sorter.normal;

/**
 * @author qingy
 * @since 2021/8/5
 */
public class SortingTool {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile(args[0]);
    }
}
