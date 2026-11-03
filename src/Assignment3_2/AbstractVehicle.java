package Assignment3_2;

public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    protected String type;
    protected String fuel;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, String fuel, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void displayBasicInfo() {
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuel);
    }

    @Override
    public void charge() {
        System.out.println("Not possible to charge.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }
}
