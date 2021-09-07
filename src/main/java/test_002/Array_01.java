package test_002;

public class Array_01 {

    public static void main(String[] args){
        double[] myList=new double[10];//声明
        int total=0;
        for(int i=0;i<10;i++){
            myList[0]=2;
            if(i>=1){
                myList[i]=myList[i-1]+2;
                total+=myList[i];
            }else total+=myList[i];
        }
        System.out.println(total);
        for (double x :myList){
            System.out.println(x);
        }
    }



}
