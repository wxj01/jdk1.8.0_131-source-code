package test.proxy.demo01;

/**
 *  ��̬������ �Ƿ� һ����Ҫʵ�� �������ࣨHost���Ľӿڣ�
 *
 *  ����д������ProxyHostT Ҳ�ǿ�����������Host ��
 */
public class ProxyHostT {

    // ����һ����������û�г�ʼ����null
    private Host host;

    // ����һ���вι��췽��
    public ProxyHostT(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }
}