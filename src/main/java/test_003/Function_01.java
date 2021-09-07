package test_003;

public class Function_01 {
    public String[] x;  //变量声明

    Function_01(){  //构造函数，用来初始化字符串x
        //String[] x =new String[]{"li","hao","ran","good!"};
        x=new String[]{"li","hao","ran","good!"};
    }

    public static void Println(String x[]){
        for(int i=0;i<x.length;i++){
            System.out.println("x["+i+"]:"+x[i]);
        }
    }

    public static void main(String[] args){
        Function_01 t=new Function_01();   //创建类对象
        Println(t.x);                      //调用函数和对象t的构造函数的x值
    }



}
