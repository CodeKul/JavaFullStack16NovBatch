package superkeyword;
/**
 * super keyword used to invoked immediate parent class method
 */
public class Birds {
    void fly(){
        System.out.println("Birds are flying");
    }
}
class Pigeon extends Birds{
    void fly(){
        super.fly();
        System.out.println("Pigeon is flying");
    }

    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.fly();
    }
}
