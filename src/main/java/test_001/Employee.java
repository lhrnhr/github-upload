package test_001;

public class Employee {
    String name;
    int age;
    String position;
    int salary;

    public Employee(String name){
        this.name=name;
    }

    public void emAge(int x){
        age=x;
    }

    public void emPosition(String y){
        position=y;
    }

    public void emSalary(int z){
        salary=z;
    }

    public void print(){
        System.out.println("名字是"+name);
        System.out.println("年龄是"+age);
        System.out.println("职位是"+position);
        System.out.println("工资是"+salary);
        System.out.println("----------------");
    }
}
