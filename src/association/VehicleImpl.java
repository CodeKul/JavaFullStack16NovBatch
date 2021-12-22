package association;

public class VehicleImpl {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("White");
        car.setModel("Zeta");
        car.setName("Maruti");
        car.setPower(200);
        car.setSpeed(200);
        car.setMileage(18);
        Engine engine = new Engine();
        engine.setPower(55);
        car.setEngine(engine);
        MPlayer mPlayer = new MPlayer();
        mPlayer.setName("VLC");
        mPlayer.setVolume("50%");
        car.setmPlayer(mPlayer);

    }
}
// College, Address, Prof, Student,Dept,Lab