package me.qingy.dp.structural.proxy;

/**
 * @author qingy
 * @since 2021-02-27
 */
public class StaticProxyDemo {
    public static void main(String[] args){
        IService service = new IService.ServiceImpl();
        ProxyService proxyService = new ProxyService(service);
        proxyService.say();
    }

    static class ProxyService implements IService{
        private IService realService;

        public ProxyService(IService realService) {
            this.realService = realService;
        }

        @Override
        public void say() {
            System.out.println("proxy entering");
            realService.say();
            System.out.println("proxy leaving");
        }
    }
}
