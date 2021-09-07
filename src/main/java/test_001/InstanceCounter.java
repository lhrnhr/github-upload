package test_001;

public class InstanceCounter {
    public static int a=0;   //定义一个独立于对象的静态变量，无论实例化多少对象都只有一份拷贝
    public static int getA(){  //声明独立于对象的静态方法，不能使用类的非静态变量，也就是如果a的声明不是static，那么该静态方法就不能调用a
        return a;
    }

    public static void add(){
        a++;
    }

    InstanceCounter(){
        InstanceCounter.add();
    }

    public static void main(String[] args){
        System.out.println("there is"+a);
        for(int i=0;i<500;++i){
            new InstanceCounter();
        }
        System.out.println("there is"+a);
    }
}
