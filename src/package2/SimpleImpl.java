package package2;


import package1.Simple;

public class SimpleImpl extends Simple{

    public static void main(String[] args) {
        SimpleImpl simple = new SimpleImpl();
        simple.getMsg();
        System.out.println(simple.i);
    }
}
