package thiskeyword;

/**
 * 1. to refer current class instance variables
 * 2. to invoke current class method
 * 3. to invoke current class constructor
 * 4. to pass as an argument in the method
 * 5. to pass as argument in the constructor call
 * 6. to return current class instance
 */
public class A {
    private int a;
    private String name;

    A(int a, String name){
        this();
        this.a = a;
        this.name = name;
    }
    A(){
        a = 15;
        name = "dd";
        System.out.println("a =" +a +" name = "+name);
    }
    void display(){
        this.show(); //explicit call
        show(this);
    }
    void show(){
      //  System.out.println(this);
        System.out.println(a);
        System.out.println(name);
    }

    void show(A a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        A t1 = new A(20,"aaa");
     //   System.out.println(t1);
        t1.display();
    }
}
