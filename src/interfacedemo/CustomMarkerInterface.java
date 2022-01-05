package interfacedemo;

public interface CustomMarkerInterface {
}

class Test implements CustomMarkerInterface{
    void display(){
        System.out.println("Hello!!!");
    }
    void show(){
        System.out.println("Good Afternoon");
    }
}

class Test1 extends Test{
    void display(){
        System.out.println("Hello!!!");
    }
}

class TestImpl{
    public static void main(String[] args) {
        Test test = new Test();
        Test1 test1 = new Test1();
        if (test instanceof CustomMarkerInterface)
            test.display();
        else
            test.show();
    }
}