package test.proxy.demo01;

/**
 * ����һ�������࣬����Ҫ���ⷿ�ӣ�ʵ���ⷿRent �ӿ�
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("���Ƿ�������Ҫ�����ҵķ��ӣ�");
    }
}