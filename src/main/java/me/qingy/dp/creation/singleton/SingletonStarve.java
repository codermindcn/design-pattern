package me.qingy.dp.creation.singleton;

/**
 * 饿汉式
 * 不支持延迟加载，但其实比懒汉更优，更符合 fail-fast 原则，有问题早暴露，占用资源多更应该在程序启动时初始化，如果有 OOM 问题也可以及早发现
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
