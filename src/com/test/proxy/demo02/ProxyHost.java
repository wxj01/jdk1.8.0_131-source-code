package test.proxy.demo02;

public class ProxyHost implements Rent{

    //第一类房东
    private Host host;

    // 构造方法 用来初始化host
    public ProxyHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse(){
        System.out.println("看房子");
    }
}