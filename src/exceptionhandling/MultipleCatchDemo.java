package exceptionhandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] array = {10,20,30};
            System.out.println(array[5]);
            int a = 10/0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("in ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException ae){
            System.out.println("in ArithmeticException");
        }
        catch (Exception e){
            System.out.println("in Exception");
        }
    }
}

/**
 *  1.  one try has multiple catch and one finally block
 *  2.  multiple catch block must be followed by specific to general
 *  3.  try block must have either catch or finally block
 *  4.  @ one time only one exception get caught(more specific exception)
 */