package superkeyword;

/**
 *  super used to refer immediate parent class instance variables
 */
public class Parent {
    int a = 20;
}
class Child extends Parent{
    int a = 15;
    void show(int a){
        System.out.println("Local: "+a); // 5
        System.out.println("this: "+this.a); //15
        System.out.println("super: "+super.a); //20
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.show(5);
    }
}
