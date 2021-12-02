package constructor;

/**
 * Note:
 * 1. name of constructor is same as class name
 * 2. it does not have return type
 * 3. you can specify access specifiers to constructor
 * 4. constructors can not be abstract,synchronised,static,final
 * 5. Types of Constructor: a) Default constructor b) Parameterised
 * 6. constructor can be overloaded
 */
public class Person {
    private int id;
    private String name;
    Person(){
        System.out.println("in constructor");
    }
    Person(int id){
        this.id = id;
    }
    Person(int i,String nm){
        id = i;
        name = nm;
    }
    public static void main(String[] args) {
        System.out.println("B4 obj creation");
        Person person = new Person(5,"abc");
        System.out.println("Id: "+person.id);
        System.out.println("Name: "+person.name);

        person = new Person(7,"xyz");
        System.out.println("After obj created");
        System.out.println("Id: "+person.id);
        System.out.println("Name: "+person.name);
    }
}
