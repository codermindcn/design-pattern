package me.qingy.dp.creation.singleton;

/**
 * 静态内部类
 * 类似懒汉式，但支持延迟加载，同时也支持高并发，创建时的线程安全和唯一性交由 JVM 保证
 * 比双重检测实现起来更简单
 *
 * @author qingy
 * @since 2021/7/28
 */
public class SingletonInner {
    private SingletonInner() {
    }

    /**
     * 延迟加载：只有调用该方法时 Holder 才会被加载
     */
    public static SingletonInner getInstance() {
        return Holder.instance;
    }

    /**
     * 唯一性、创建过程的线程安全性都由 JVM 保证
     */
    private static class Holder {
        private static final SingletonInner instance = new SingletonInner();
    }
}
