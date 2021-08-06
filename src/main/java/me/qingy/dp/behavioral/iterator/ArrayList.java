package me.qingy.dp.behavioral.iterator;

/**
 * @author qingy
 * @since 2021/8/6
 */
public class ArrayList<E> implements List<E> {
    public Iterator<E> iterator() {
        return new ArrayIterator<>(this);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get(int cursor) {
        return null;
    }
    //...省略其他代码
}
