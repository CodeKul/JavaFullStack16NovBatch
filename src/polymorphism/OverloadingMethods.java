package polymorphism;

public class OverloadingMethods {

    public int add(int a,int b){
        return a+b;
    }

    static long add(long a,long b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(OverloadingMethods.add(20L,20L));
    }
}
