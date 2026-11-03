package Assignment3_2;

public class Car extends AbstractVehicle {

    public Car() {
        super("Car", "Petrol", 15.0);
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Car Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: Red";
    }
}
