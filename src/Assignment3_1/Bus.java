
package Assignment3_1;

public class Bus extends Car {

    private int passengers;
    private int maxPassengers;

    public Bus(String typeName, int maxPassengers) {
        super(typeName);
        this.passengers = 0;
        this.maxPassengers = maxPassengers;
    }

    public void passengerEnter() {
        if (passengers < maxPassengers) {
            passengers++;
            System.out.println("A passenger entered.");
        } else {
            System.out.println("The bus is full.");
        }
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
            System.out.println("A passenger exited.");
        } else {
            System.out.println("The bus is empty.");
        }
    }

    public int getPassengers() {
        return passengers;
    }
}

