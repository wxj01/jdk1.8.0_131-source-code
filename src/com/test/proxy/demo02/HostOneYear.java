package test.proxy.demo02;

/**
 *  第3种房东，条件：需要出租3个月起。
 *
 */
public class HostOneYear implements Rent{
    @Override
    public void rent() {
        System.out.println("我是2号房东，我出租房子的要求是至少一年起。");
    }

    //
    public void work(){
        System.out.println("我平时要上班！");
    }
}