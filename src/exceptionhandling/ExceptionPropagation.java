package exceptionhandling;

public class ExceptionPropagation {
    void m1(){
        int a = 10/0;
    }
    void m2(){
        m1();
    }
    void m3(){
        m2();
    }
    public static void main(String[] args) {
        ExceptionPropagation propagation = new ExceptionPropagation();
        try {
            propagation.m3();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
