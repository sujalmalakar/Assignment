package Assignment3_2;

public class Bus extends AbstractVehicle {

    private int capacity;

    public Bus() {
        super("Bus", "Diesel", 8.0);
        this.capacity = 40;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public String getInfo() {
        return "Bus Information:\nType: " + type + "\nFuel: " + fuel
                + "\nCapacity: " + capacity + " passengers";
    }
}
