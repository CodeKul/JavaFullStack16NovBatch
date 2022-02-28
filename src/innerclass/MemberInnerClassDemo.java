package innerclass;

public class MemberInnerClassDemo {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        o1.n = 50;
        o1.show();
        Outer.Inner inner = o1.new Inner();
        inner.n1 = 40;
        inner.display();
    }
}

class Outer{
    int n = 10;// member variable

    void show(){ // member function/method
        System.out.println("in outer class method");
    }

    class Inner{
        int n1 = 20;
        void display(){
            System.out.println("in inner class method");
        }
    }
}