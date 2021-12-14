package statickeyword;

public class Emp {
    private int empId;
    private String eName;
    static private String cname = "CodeKul";

    static { // @ the time of class load
        System.out.println("I'm in static");
    }
    public Emp(){  // @ the time of object creation
        System.out.println("I'm in Default");

    }

    public Emp(int empId, String eName) {
        this.empId = empId;
        this.eName = eName;
    }

    void show(){
        System.out.println("EmpID: "+empId + " EmpName: "+eName + " Company Name: "+cname);
    }

    public static void main(String[] args) {
        Emp emp = new Emp();
        Emp emp1 = new Emp(1,"emp1");
        Emp emp2 = new Emp(2,"emp2");
        Emp emp3 = new Emp(3,"emp3");
        Emp.cname = "FB";
        emp1.show();
        emp2.show();
        emp3.show();
    }
}
