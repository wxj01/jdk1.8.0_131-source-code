package test.proxy.demo01;

/**
 * ���Գ��� �������Ϊ Ҫ�ⷿ���ˣ�
 */
public class TestProxy {


    public static void main(String[] args) {

        //��ʵ��ɫ���˺�Ļ��ֻ�����ṩ�ⷿ���������
        Host host = new Host();

        // ����һ�������࣬������ ��Ҫ�� ��������֮�佨��һ����ϵ����ȡ���������ⷿ������
        ProxyHost proxyHost = new ProxyHost(host);

        proxyHost.rent();
    }
}