package variables;
public class TestStatic {
    static int i = 10;
    void display(){
        int j = 10;
        System.out.println("i = "+i +" & j = "+j);
        //++i;
       // ++j;
        i = i + 1;
        j = j + 1;
    }
    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic();
        testStatic.display(); //i = 10 & j = 10
        testStatic.display(); //i = 11 & j = 10
    }
}
