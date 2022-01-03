package interfacedemo;

public class EmployeeImpl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(1,"Sam",500000);
        Employee cloneEmployee = (Employee) e1.clone();
        cloneEmployee.display();
    }
}
