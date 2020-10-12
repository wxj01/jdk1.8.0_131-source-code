package test.proxy.demo01;

/**
 *  静态代理类 是否 一定需要实现 被代理类（Host）的接口？
 *
 *  这里写代理类ProxyHostT 也是可以正常代理Host 的
 */
public class ProxyHostT {

    // 声明一个房东对象，没有初始化，null
    private Host host;

    // 定义一个有参构造方法
    public ProxyHostT(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }
}