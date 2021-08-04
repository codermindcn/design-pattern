package me.qingy.dp.behavioral.observer.event_bus_wheel;

import com.google.common.base.Preconditions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 用来表示 @Subscribe 注解的方法，主要用在 ObserverRegistry 观察者注册表中
 *
 * @author qingy
 * @since 2021-08-04
 */
public class ObserverAction {
    /**
     * 观察者类
     */
    private Object target;
    /**
     * 观察者方法
     */
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = Preconditions.checkNotNull(target);
        this.method = method;
        this.method.setAccessible(true);
    }

    public void execute(Object event) { // event是method方法的参数
        try {
            method.invoke(target, event);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
