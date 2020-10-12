package test.proxy.demo02;

public class ProxyHost implements Rent{

    //��һ�෿��
    private Host host;

    // ���췽�� ������ʼ��host
    public ProxyHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse(){
        System.out.println("������");
    }
}