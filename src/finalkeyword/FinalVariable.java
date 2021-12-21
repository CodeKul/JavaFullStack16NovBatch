package finalkeyword;

/**
 * Final is non-access modifier
 * Final keyword used for restriction
 * Final can be used with variables,methods,classes
 * 1. Variables -> constant value,cannot change the value
 * 2. Method -> prevent overriding
 * 3. Class -> prevent inherit
 */
public class FinalVariable {
    final float PI; //blank final variable
    final static int PERCENTAGE;  //blank final variable
    static {
        PERCENTAGE = 100;
    }
    FinalVariable(){
        PI = 3.14f;
    }
    public static void main(String[] args) {
        final int a = 10;
        System.out.println(a);
    }
}