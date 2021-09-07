package test_001;
import java.lang.*;

public class Reference {


    public static void main(String[] args) {
        /*多种引用方法,其中a、b、c、d都是引用变量
         */
        String a ;
        a =new String("li") ;
        System.out.println(a.toString());

        String b = new String("hao");
        System.out.println(b.toString());

        String c = new String();
        c="ran";
        System.out.println(c.toString());

        String d = "!";
        System.out.println(d.toString());

        int e= '\u0011';
        System.out.println(e);

        char f= '\u0011';
        System.out.println("错误输出为："+f);
        int f_1=f;
        System.out.println("强制类型转换后："+f_1);
    }

}
