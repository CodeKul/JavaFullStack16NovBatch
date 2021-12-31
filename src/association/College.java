package association;

public class College extends Institute {
    private String name;
    private Address address;
    private Department department;
}
class Address{
    private String streetName;
    private int postalCode;
    private String landmark;
    private String city;
    private String flatNo;
}
class Department{
    private String deptName;
    private int rooms;
    private Labs labs;
    private Professor professor;
    private Student student;
}
class Labs{
    private Professor professor;
}
class Professor{
    private String name;
    private int id;
    private Address address;
}
class Student{
    private String name;
    private int rollNo;
    private Address address;
}

