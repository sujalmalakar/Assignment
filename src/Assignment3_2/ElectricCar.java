package Assignment3_2;

public class ElectricCar extends AbstractVehicle {

    public ElectricCar() {
        super("Electric Car", "Electricity", 0.20);
    }

    @Override
    public void start() {
        System.out.println("Electric car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\nType: " + type + "\nFuel: " + fuel;
    }

    @Override
    public void charge() {
        System.out.println("Electric car is charging...");
    }
}
