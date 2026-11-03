package Assignment3_2;

public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle() {
        super("Electric Motorcycle", "Electricity", 0.10);
    }

    @Override
    public void start() {
        System.out.println("Electric motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Electric motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\nType: " + type + "\nFuel: " + fuel;
    }

    @Override
    public void charge() {
        System.out.println("Electric motorcycle is charging...");
    }
}
