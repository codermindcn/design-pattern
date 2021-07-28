package me.qingy.dp.creational.singleton;

/**
 * 饿汉式
 * 不支持延迟加载，但其实比懒汉更优，更符合 fail-fast 原则，有问题早暴露
 * 如果占用资源多更应该延迟加载，而是应该在程序启动时完成初始化，资源不足触发 OOM 等问题也可以及早发现
 *
 * @author qingy
 * @since 2021/7/28
 */
public class SingletonStarve {
    private static final SingletonStarve instance = new SingletonStarve();

    private SingletonStarve() {
    }

    public static SingletonStarve getInstance() {
        return instance;
    }
}
