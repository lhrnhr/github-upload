package test_002;

public class String_03 {
    public static void main(String[] args){
        String x= "aaa456ac";
        System.out.println(x.toUpperCase());
        System.out.println(x.replaceAll("aaa","good"));
        System.out.println(x.replaceAll("bbb","good"));

        System.out.println(x.isEmpty());
    }
}
