package test_002;

import java.util.Scanner;

public class Condition_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入分数：");
        int a = input.nextInt();//输入一个整数

        switch (a){

            case 60:
                System.out.println("及格");
                break;
            case 80:
                System.out.println("良好");
                break;
            case 90:
                System.out.println("优秀");
                break;
            default:
                System.out.println("输入无效");
        }
    }
}
