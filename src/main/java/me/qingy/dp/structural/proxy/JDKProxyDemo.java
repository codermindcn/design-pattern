package me.qingy.dp.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author qingy
 * @since 2021-02-27
 */
public class JDKProxyDemo {
    public static void main(String[] args) {
        IService.ServiceImpl service = new IService.ServiceImpl();
        IService proxyService = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(),
                new Class<?>[]{IService.class}, new MyInvocation(service));
        proxyService.say();
    }

    static class MyInvocation implements InvocationHandler {
        private Object realObj;

        public MyInvocation(Object realObj) {
            this.realObj = realObj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("proxy entering " + method.getName());
            Object result = method.invoke(realObj, args);
            System.out.println("proxy leaving " + method.getName());
            return result;
        }

        public Object getProxyInstance() {
            return Proxy.newProxyInstance(realObj.getClass().getClassLoader(), realObj.getClass().getInterfaces(), this);
        }
    }
}
