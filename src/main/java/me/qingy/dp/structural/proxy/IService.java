package me.qingy.dp.structural.proxy;

/**
 * @author qingy
 * @since 2021-02-27
 */
public interface IService {
    void say();

    class ServiceImpl implements IService {
        @Override
        public void say() {
            System.out.println("hello from real service");
        }
    }
}
