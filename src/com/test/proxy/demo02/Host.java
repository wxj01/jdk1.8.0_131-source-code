package test.proxy.demo02;

/**
 * ����һ�������࣬����Ҫ���ⷿ�ӣ�ʵ���ⷿRent �ӿ�
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("���Ǹ��˷�������Ҫ�����ҵķ��ӣ�");
    }
}