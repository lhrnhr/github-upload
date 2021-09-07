package test_002;

public class Loop_01 {
    static int a=10;

    public static void hh(){
        a=11;
    }

    public static void main(String[] args){
        Loop_01 s1=new Loop_01();
        Loop_01 s2=new Loop_01();
        System.out.println("a的值为："+s1.a);
        System.out.println("-----------");
        Loop_01.hh();
        System.out.println("执行hh函数后a的值为："+s1.a);
        System.out.println("-----------");
        System.out.println("创建另外一个对象时a的值为："+s2.a);
        System.out.println("-----------");
        while (a<20){
            System.out.println(a);
            a++;
        }
    }

}
