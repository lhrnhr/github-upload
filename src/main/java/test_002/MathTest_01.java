package test_002;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class MathTest_01 {
    public static void main(String[] args){
        System.out.println(Math.cos(0));
        System.out.println(Math.PI);
        String x="hhh";
        System.out.println(x.compareTo("hjj"));

        Float a= Float.valueOf("345");
        System.out.println(a);

        System.out.println(Integer.toString(55));

        System.out.println(Math.ceil(110.33));

        int b = Integer.parseInt("2");
        System.out.println(b);

        System.out.println("E的值为"+Math.E);
        System.out.println("E的平方为"+Math.exp(2));

        System.out.println(Math.pow(1,2));
        System.out.println(Math.random());
    }
}
