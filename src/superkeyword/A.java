package superkeyword;
/**
 * super keyword used to invoked immediate parent class constructor
 */

public class A {
    A(){
        System.out.println("I'm in parent class");
    }
}
class B extends A{
    B(){
        System.out.println("I'm in base class");
    }
}

class C extends B{
    C(){
        super(); //explicit
        System.out.println("I'm in C");
    }
    public static void main(String[] args) {
        C c = new C();
    }
}

//constructor,oper,inheritance,control stmt,encapsulation,pattern