package stringdemo;

/**
 * toString() - represents object as a string
 */
public class Employee {
    private Integer eid;
    private String empName;
    private String mobileNo;
    private String emailId;
    private String address;

    public Employee(Integer eid, String empName, String mobileNo, String emailId, String address) {
        this.eid = eid;
        this.empName = empName;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class EmployeeImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Mahavir","486565165","mahavir@gmail.com","Hingoli");
        Employee e2 = new Employee(2,"Aditya","5465465465","aditya@gmail.com","Pune");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
