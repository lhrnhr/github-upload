package test_002;

public class String_04 {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder(10);
        sb.append(3);
        System.out.println(sb);
        sb.append('x');
        sb.append(sb);//依次加入
        sb.append(sb);//依次加入
        System.out.println(sb);
        sb.reverse();//反转
        System.out.println(sb);
        sb.replace(2,8,"yyy");
        System.out.println(sb.capacity());//查看StringBuilder的容量
    }
}
