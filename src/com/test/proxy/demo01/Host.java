package test.proxy.demo01;

/**
 * 定义一个房东类，房东要出租房子，实现租房Rent 接口
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("我是房东，我要出租我的房子！");
    }
}