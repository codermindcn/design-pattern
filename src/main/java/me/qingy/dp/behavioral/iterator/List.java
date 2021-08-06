package me.qingy.dp.behavioral.iterator;

/**
 * @author qingy
 * @since 2021/8/6
 */
public interface List<E> {
    Iterator<E> iterator();

    int size();

    E get(int cursor);

    //...省略其他接口函数...
}
