package test_002;

public class String_02 {

    public static void main(String[] args){
        char[] ch={'a','b','n','r'};
        String ch1 =new String(ch);
        String ch2=new String("xxx");
        System.out.println(ch);
        System.out.println("ch的第一个元素是："+ch[0]);
        System.out.println("ch1："+ch1.length());
        System.out.println("----------");
        System.out.println(ch1.contentEquals(ch2));
        ch2=ch1.concat(ch2);
        System.out.println(ch2);
    }
}
