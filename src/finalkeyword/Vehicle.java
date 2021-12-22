package finalkeyword;
// final method
public class Vehicle {
    final void run(){
        System.out.println("running");
    }
}

class TwoWheeler extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
    }
}
///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