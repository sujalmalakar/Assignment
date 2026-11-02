
package Assignment3_1;

public class SportsCarTest {

    public static void main(String[] args) {

        SportsCar car = new SportsCar("Ferrari");

        car.fillTank();

        car.accelerate();

        System.out.println("Car: " + car.getTypeName());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Gasoline: " + car.getGasolineLevel());

        car.decelerate(5);

        System.out.println("Speed after deceleration: " + car.getSpeed());
    }
}

