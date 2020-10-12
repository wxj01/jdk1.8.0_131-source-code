package test.proxy.demo01;

/**
 * 测试程序 可以理解为 要租房的人，
 */
public class TestProxy {


    public static void main(String[] args) {

        //真实角色，退后幕后，只负责提供租房这个操作。
        Host host = new Host();

        // 定义一个代理类，代理类 需要和 被代理类之间建立一个联系，获取到房东的租房操作。
        ProxyHost proxyHost = new ProxyHost(host);

        proxyHost.rent();
    }
}