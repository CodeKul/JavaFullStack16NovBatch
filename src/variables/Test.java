package variables;

public class Test {
    int a = 5; //instance variable
    static int b = 10; //static variable

    public static void main(String[] args) {
        int local = 15; //local variable
        Test test = new Test();
        System.out.println("Value of a is "+test.a);
        System.out.println("Value of local is "+local);
        System.out.println("Value of b is "+Test.b);
    }
}
