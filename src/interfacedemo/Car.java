package interfacedemo;

public class Car implements Vehicle{
    private int speed= 100;

    @Override
    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    @Override
    public void display(){
        System.out.println("Speed is "+speed);
    }

    @Override
    public double sanctionLoan() {
        return 250000;
    }
}
