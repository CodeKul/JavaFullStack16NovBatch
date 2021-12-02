package basic;

public class Test {
    String p1 = "Fan123213";
    String[] p2 = {"Ac1","Ac2"};
    String p3 = "Tv";

    public static void show(){
        System.out.println("In show");
        System.out.println("In show");
        System.out.println("In show");
    }

    public int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Test var = new Test();

        show();

        System.out.println(var.add(3,4));
        System.out.println(var.p1);

    }
}
