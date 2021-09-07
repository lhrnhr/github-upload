package test_003;

import java.util.regex.*;

public class Expression_01 {
    public static void main(String[] args){
        String all="hello"+"lhr";
        String part=".*lhr.*";
        boolean result = Pattern.matches(part,all);
        System.out.println(result);
    }

}
