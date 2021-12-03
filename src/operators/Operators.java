package operators;

/**
 * 1. Arithmetic
 * 2. Relational
 * 3. Unary
 * 4. Shift
 * 5. Bitwise
 * 6. Logical
 * 7. Ternary
 * 8. Assignment
 */
public class Operators {
    public static void main(String[] args) {
        int a = 10,b = 12;
        //Relational Operators
        System.out.println(a>b); //false
        System.out.println(a<b); //true
        System.out.println(a<=b); //true
        System.out.println(a>=b); //false
        System.out.println(a!=b); //true

        //Unary Operator
        System.out.println(a++); //10
        System.out.println(++a); //12

        System.out.println(a--); //12
        System.out.println(--a); //10

        System.out.println(~a); //(-a)-1 = -11

        //Shift Operator
        a = 10;
        b=12;
        System.out.println(a<<2); // 10*2^2= 40
        System.out.println(a>>2);  // 10/2^2=2

        a = 10;
        b=12;
        // Logical Operator
        System.out.println(a>b && ++b>a);
        System.out.println("A is " +a+ " B is "+b);

        //Bitwise Operator
        System.out.println(a>b & ++b>a);
        System.out.println("A is " +a+ " B is "+b);

        //Ternary
        String result;
        result = (a<b) ? "a is small than b":"b is small than a";
        System.out.println(result);

        //Assignment
        System.out.println(a+=b);
    }
}
