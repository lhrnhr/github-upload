package test_003;

public class Function_02 {
    public static void main(String[] args){
        System.out.println(maxPrint(1,2,3,3.5,2.8));
    }

    public static double maxPrint(double ...x){
        if(x.length==0){
            System.out.println("default");
        }
        double result = x[0];
        for(int i=1;i<x.length;i++){
            if(result<x[i]){
                result=x[i];
            }
        }
        return result;
    }
}
