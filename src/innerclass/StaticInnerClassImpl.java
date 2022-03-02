package innerclass;


class StaticInnerClass{
    static String msg = "Welcome";
    static class Inner1{
        void show(){
            System.out.println("Msg "+msg);
        }
    }
}
public class StaticInnerClassImpl {
    public static void main(String[] args) {
        StaticInnerClass.Inner1 inner = new StaticInnerClass.Inner1();
        inner.show();
    }
}
