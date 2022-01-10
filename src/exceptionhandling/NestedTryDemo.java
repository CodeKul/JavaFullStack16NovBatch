package exceptionhandling;

public class NestedTryDemo {
    public static void main(String[] args) {
        try{
            try{
                int[] array = {10,20,30};
                System.out.println(array[5]);
            }catch (ArrayIndexOutOfBoundsException ae){
                ae.printStackTrace();
            }
            int a = 10/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
