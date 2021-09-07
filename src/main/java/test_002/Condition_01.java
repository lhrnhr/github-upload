package test_002;

import java.util.Scanner;

public class Condition_01 {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("请输入分数：");
        int a=input.nextInt();//输入一个整数
        if(a>0&&a<60){
            System.out.println("不及格");
        }else if(a>=60&&a<80) {
            System.out.println("良好");
        }
        else if(a>=80&&a<=100) {
            System.out.println("优秀");
        }
        else{
            System.out.println("成绩无效");
        }
    }
}
