package test_001;

public class Student extends Person {
    protected void Human(){
        System.out.println("bbh");
    }


    public static void main(String[] args ){
        Student stu = new Student();
        stu.Human();

        Person p = new Person();
        p.Human();
    }

}
