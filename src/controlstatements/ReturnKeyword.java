package controlstatements;

public class ReturnKeyword {

    public static void main(String[] args) {
        int x=10;
        int y=10;
        System.out.println(add(x,y));
    }
    static int add(int x, int y){
        return x+y;
    }
}
