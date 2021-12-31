package interfacedemo;

public class CarImpl {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.applyBrakes(5);
        vehicle.display();

    }
}
