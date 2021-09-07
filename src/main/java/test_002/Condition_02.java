package test_002;

import java.util.Scanner;

public class Condition_02 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("请输入分数：");
        int a=input.nextInt();//输入一个整数

        if(a>0){
            if(a>=60){
                System.out.println("及格");
                if(a>=80){
                    System.out.println("良好");
                    if (a >=90) {
                        System.out.println("优秀");
                    }
                }
            }
        }
    }
}
