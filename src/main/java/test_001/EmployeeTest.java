package test_001;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee em1=new Employee("001");
        Employee em2=new Employee("002");

        em1.emAge(23);
        em1.emPosition("ggaoji");
        em1.emSalary(10000);
        em1.print();

        em2.emAge(21);
        em2.emPosition("diji");
        em2.emSalary(1000);
        em2.print();
    }
}
