package test_002;

public class Loop_02 {

    public static void main(String[] args){
        int number[]={1,2,3,4,5};
        String name[]={"jack","lucy","marry"};
        for (int a:number){
            System.out.println(a);
            if(a==3){
                continue;
            }
        }
    }
}
