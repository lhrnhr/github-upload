package test_003;

public class Max {
    public static void main(String[] args){
        int x=3;
        int y=6;
        int z;
        z=max(x,y);
        System.out.println(z);
        nPrintln("good",3);
    }

    public static int max(int a,int b){
        return a>b?a:b;
    }

    public static void nPrintln(String message,int n){
        for(int i=0;i<n;i++){
            System.out.println(message);
        }
    }

}
