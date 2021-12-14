package statickeyword;

public class StaticBlock {
    static int x = 10;
    int y = 5;
    static {
        x = 15;
        System.out.println("I'm static block");
    }
    static void show(){
        x = 15;
    }
    void print(){
        x = 20;
        y = 35;
        show();
    }
    public static void main(String[] args) {
        System.out.println("I'm main fun");
    }

}
