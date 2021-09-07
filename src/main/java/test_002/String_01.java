package test_002;

public class String_01 {

    public static void main(String[] args){
        String a = "xxx";
        String b = "nnn";

        String c = new String("yyy");
        //对象创建的方式不能以相同命名再次创建 example：String c = new String("zzz");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
