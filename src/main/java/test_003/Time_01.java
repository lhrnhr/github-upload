package test_003;

import java.util.*;

public class Time_01 {
    public static void main(String[] args){
        Date x = new Date();
        Date y = new Date(99,2,18);
        System.out.println(x.before(y));
        System.out.println(x.after(y));
        System.out.println(x.compareTo(y));
    }
}
