package exceptionhandling;

/***
 * throw - used explicitly throw an exception within a method
 */
public class ThrowExample {
    static void validateAge(int age){
        try {
            if (age > 45 && age < 60) { //between 45-60range
                throw new ArithmeticException("Not eligible for vaccine");
            }
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThrowExample.validateAge(46);
        System.out.println("Remaining code");
    }
}
