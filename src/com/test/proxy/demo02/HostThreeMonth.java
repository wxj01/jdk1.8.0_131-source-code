package test.proxy.demo02;

public class HostThreeMonth implements  Rent{

    @Override
    public void rent() {
        System.out.println("我是3号房东，我出租房子的要求是至少3个月起。");
    }
}