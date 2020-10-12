package test.proxy.demo01;

public class ProxyHost implements Rent{

    // ����һ����������û�г�ʼ����null
    private Host host;

    // ����һ���вι��췽��
    public ProxyHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }
}