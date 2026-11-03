package Assignment3_2;

public class VehicleDemo {

    public static void main(String[] args) {

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();
        ElectricCar electricCar = new ElectricCar();
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle();

        System.out.println("Vehicle Demonstration");
        System.out.println();

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        car.charge();
        System.out.println("Fuel efficiency: " + car.calculateFuelEfficiency() + " MPG");
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        motorcycle.charge();
        System.out.println("Fuel efficiency: " + motorcycle.calculateFuelEfficiency() + " MPG");
        System.out.println();

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        bus.charge();
        System.out.println("Fuel efficiency: " + bus.calculateFuelEfficiency() + " MPG");
        System.out.println();

        electricCar.start();
        electricCar.stop();
        System.out.println(electricCar.getInfo());
        electricCar.charge();
        System.out.println("Energy consumption: " + electricCar.calculateFuelEfficiency() + " kWh/km");
        System.out.println();

        electricMotorcycle.start();
        electricMotorcycle.stop();
        System.out.println(electricMotorcycle.getInfo());
        electricMotorcycle.charge();
        System.out.println("Energy consumption: " + electricMotorcycle.calculateFuelEfficiency() + " kWh/km");
    }
}