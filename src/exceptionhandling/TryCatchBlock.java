package exceptionhandling;

public class TryCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(1);
            int n = 10/0;
            System.out.println(2);
        }catch (ArithmeticException ae){
          //  System.out.println("No cannot be divide by 0");
         //   System.out.println(ae.getMessage());
            ae.printStackTrace();
           // System.out.println(ae);
        }finally {
            System.out.println("in finally block");
        }
        System.out.println(3);
        System.out.println(4);
    }
}
