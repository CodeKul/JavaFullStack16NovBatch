package interfacedemo;

//Cloneable interface
public class Employee  implements Cloneable{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("id "+id +" name "+name+" Salary "+salary);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

