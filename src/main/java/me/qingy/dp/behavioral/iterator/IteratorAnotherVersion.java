package me.qingy.dp.behavioral.iterator;

/**
 * 迭代器接口定义方式二
 *
 * @author qingy
 * @since 2021/8/6
 */
public interface IteratorAnotherVersion<E> {
    boolean hasNext();
    E next();
}
