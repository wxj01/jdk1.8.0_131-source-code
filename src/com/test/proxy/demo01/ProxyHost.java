package test.proxy.demo01;

public class ProxyHost implements Rent{

    // 声明一个房东对象，没有初始化，null
    private Host host;

    // 定义一个有参构造方法
    public ProxyHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }
}