package association;

public class Vehicle {
    private int speed;
    private int mileage;
    void brakes(){
        System.out.println("in Brakes");
    }
    void acceleration(){
        System.out.println("in acceleration");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}

class Car extends Vehicle{
    private String name;
    private String color;
    private String model;
    private double power;
    private Engine engine; //Composition
    private MPlayer mPlayer; //Aggregation
    void run(){
        System.out.println("run");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public MPlayer getmPlayer() {
        return mPlayer;
    }

    public void setmPlayer(MPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }
}class Engine {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
class MPlayer{
    private String volume;
    private String name;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

