package test.proxy.demo02;

/**
 *  ��3�ַ�������������Ҫ����3������
 *
 */
public class HostOneYear implements Rent{
    @Override
    public void rent() {
        System.out.println("����2�ŷ������ҳ��ⷿ�ӵ�Ҫ��������һ����");
    }

    //
    public void work(){
        System.out.println("��ƽʱҪ�ϰ࣡");
    }
}