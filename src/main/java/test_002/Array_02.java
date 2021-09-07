package test_002;

import java.lang.reflect.Array;

public class Array_02 {
    public static void printArray(int[] array){   //一个输出函数，参数是一维数组
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static int[] reverse(int[] Array){            //一个数组取反的函数，返回值为一维数组
        int[] NewArray = new int[Array.length];
        for(int i=0,j=Array.length-1;i<NewArray.length;i++,j--){
            NewArray[i]=Array[j];
        }
        return NewArray;
    }

    public static void main(String[] args){
        int[] Array={1,2,3,4,5};
        printArray(Array);
        System.out.println("-------");
        printArray(reverse(Array));

    }
}
