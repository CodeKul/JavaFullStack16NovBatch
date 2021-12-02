package inheritance;

public class Teacher {//parent class ,super class , base  class
    int id;
    String name;
    String address;
}

class ChemistryTeacher extends Teacher { //child class, sub class, derived class

    int salary;

    public static void main(String[] args) {
        ChemistryTeacher obj = new ChemistryTeacher();
        obj.id = 1;
        obj.name = "Suhas";
        obj.address = "Pune";

        System.out.println("Id=" + obj.id + " name=" + obj.name + " address=" + obj.address);
    }
}

class MathsTeacher extends Teacher{

    public static void main(String[] args) {
        MathsTeacher obj = new MathsTeacher();
        obj.id = 1;
        obj.name = "Suhas";
        obj.address = "Pune";

        System.out.println("Id=" + obj.id + " name=" + obj.name + " address=" + obj.address);
    }
}

class PhysicsTeacher extends Teacher{

    public static void main(String[] args) {
        PhysicsTeacher obj = new PhysicsTeacher();
        obj.id = 1;
        obj.name = "Physics";
        obj.address = "Mumbai";

        System.out.println("Id=" + obj.id + " name=" + obj.name + " address=" + obj.address);
    }
}