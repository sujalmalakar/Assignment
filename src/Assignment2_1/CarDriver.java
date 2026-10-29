public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.fillTank();

        myCar.setTargetSpeed(80);

        if (myCar.turnOnCruiseControl()) {
            System.out.println("Cruise control is on");
            System.out.println("Target speed: " + myCar.getTargetSpeed());
            System.out.println("Current speed: " + myCar.getSpeed());
        } else {
            System.out.println("Cruise control could not be turned on");
        }

        myCar.turnOffCruiseControl();
        System.out.println("Cruise control is off");
    }
}
