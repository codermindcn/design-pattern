package me.qingy.dp.behavioral.iterator;

/**
 * 迭代器接口定义方式一
 *
 * @author qingy
 * @since 2021/8/6
 */
public interface Iterator<E> {
    boolean hasNext();
    void next();
    E currentItem();
}
