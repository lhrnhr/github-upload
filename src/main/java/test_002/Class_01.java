package test_002;

public class Class_01 {

    public static char[] x={'a','b'};

    public static void main(String[] args){
        Character  ch =new Character('a');
        System.out.println(ch);
        System.out.println(x[0]);
        System.out.println("-------------");

        int x=75;
        char y = (char)x;
        char z= '\u00AB';
        System.out.println("y="+y);
        System.out.println("y是字母吗"+" "+Character.isLetter(y));
        System.out.println("-------------");

    }
}
