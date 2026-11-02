
package Assignment3_1;

public class BusTest {

    public static void main(String[] args) {

        Bus bus = new Bus("City Bus", 3);

        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();
        bus.passengerEnter();

        System.out.println("Passengers: " + bus.getPassengers());

        bus.passengerExit();

        System.out.println("Passengers: " + bus.getPassengers());
    }
}

