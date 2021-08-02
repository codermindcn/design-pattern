package me.qingy.dp.structural.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author qingy
 * @since 2021-02-27
 */
public class CGLibProxyDemo {
    public static void main(String[] args){
        IService.ServiceImpl proxy = getProxy(IService.ServiceImpl.class);
        proxy.say();
    }

    static class MyInterceptor implements MethodInterceptor{
        /**
         * @param obj 代理对象
         * @param method 目标方法
         * @param args 目标方法的参数列表
         * @param proxy 目标方法代理对象
         */
        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            System.out.println("proxy entering " + method.getName());
            Object result = proxy.invokeSuper(obj, args);
            System.out.println("proxy leaving " + method.getName());
            return result;
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> T getProxy(Class<T> cls){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(new MyInterceptor());
        return (T)enhancer.create();
    }

}
