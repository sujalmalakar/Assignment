package Assignment3_2;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle() {
        super("Motorcycle", "Gasoline", 25.0);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: Black";
    }
}
