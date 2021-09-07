package test_001;

public class DogAge {
    public String Name;
    public int Salary;

    /*如果使用构造方法，则在后面新建对象是要输入对应参数
    for example：DogAge Dog1=new DogAge("001");
     */
    public DogAge(String name) {
        Name = name;
    }

    public void getSalary(int salary) {
        Salary= salary ;
    }

    public void Print(){
        System.out.println("年龄是："+Name);
        System.out.println("工资是："+Salary);
    }

    public static void main(String[] args){
        DogAge Dog1=new DogAge("001");
        DogAge Dog2=new DogAge("002");

        //Dog1.setName("001");
        Dog1.getSalary(300);
        Dog1.Print();

        //Dog2.setName("002");
        Dog2.getSalary(200);
        Dog2.Print();

    }
}
