package test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestHashMap {

    @Test
    public void test(){


//        Class<?> kc;
//        Object k;
//        Object x;
//        String kc = "aa";
//        int  k = 0;
//        int  x = 1;
//        HashMap<String,Object> hashMap = new HashMap<>();
//        hashMap.put("abc","123");
//        for(int i = 1; i< 20 ;++i){
//            String key  = "abc"+String.valueOf(i);
//            hashMap.put(key,i);
//        }

//        HashMap.compareComparables(kc.getClass(),k,x);
//        System.out.println(hash("aaa"));

//        Persion persion;

//        hashMap.put("ab",persion);
//        System.out.println(persion.toString()); // persion 没有初始化


//        for (int binCount = 0; ; ++binCount) {
//
//            if(binCount >= 8 - 1){
//                System.out.println(binCount);
//            }
//        }

//        System.out.println((32 << 1));

        System.out.println("aaa");

        HashMap<String,Object> hashMap = new HashMap<>();
//        hashMap.put("abc","123");

        /**
         * 测试hashMap 初始化扩容，和put 实现， 当 放入元素数量 12 的时候 ，hashMap 第二次扩容机制。
         */
        for(int i = 1; i<= 13 ;i++){
            String key  = "abc"+String.valueOf(i);
            hashMap.put(key,i);
        }

        System.out.println(hashMap.toString());

    }



//    static final int hash(Object key) {
//        /**
//         *   >>>表示无符号右移，也叫逻辑右移，即若该数为正，则高位补0，而若该数为负数，则右移后高位同样补0
//         *   ^  异或运算  两个数转为二进制，然后从高位开始比较，如果相同则为0，不相同则为1。
//         */
//        int h;
//        h = key.hashCode();
//        System.out.println("hashCode:" +h);
//        int i = h >>> 16;
//        System.out.println("h >>> 16 :" + i);
//
//        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//    }



//    class Persion {
//        private final String name;
//        private String age;
//
//        public Persion(String name, String age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public String getAge() {
//            return age;
//        }
//    }

}