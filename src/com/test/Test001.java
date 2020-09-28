package test;

import org.junit.Test;

import java.util.HashMap;

public class Test001 {

    final String aa;

//    {
//        this.aa = "代码块赋值";
//    }

    public Test001(String aa) {
        this.aa = aa;
    }



    public static void main(String[] args) {
        Test001 test001 = new Test001("final成员变量，是可以通过构造方法赋值aa的");

        System.out.println(test001.aa);


    }

}