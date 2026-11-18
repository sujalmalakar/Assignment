
public class TicketReservation {

    public static void main(String[] args) {

        Theater theater = new Theater(10);

        int[] tickets = {1, 2, 2, 3, 1, 2, 1, 1, 3, 3, 2, 4, 1, 4, 3};

        Customer[] customers = new Customer[tickets.length];

        for (int i = 0; i < tickets.length; i++) {
            customers[i] = new Customer(i + 1, tickets[i], theater);
            customers[i].start();
        }

        for (int i = 0; i < customers.length; i++) {
            try {
                customers[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }

        System.out.println("Seats left: " + theater.getAvailableSeats());
    }
}

class Theater {

    private int availableSeats;

    public Theater(int seats) {
        availableSeats = seats;
    }

    public synchronized void reserveSeats(int customer, int tickets) {

        if (tickets <= availableSeats) {
            availableSeats = availableSeats - tickets;

            System.out.println("Customer " + customer +
                    " reserved " + tickets + " tickets.");
        } else {
            System.out.println("Customer " + customer +
                    " couldn't reserve " + tickets + " tickets.");
        }
    }

    public synchronized int getAvailableSeats() {
        return availableSeats;
    }
}

class Customer extends Thread {

    private int customerNumber;
    private int tickets;
    private Theater theater;

    public Customer(int customerNumber, int tickets, Theater theater) {
        this.customerNumber = customerNumber;
        this.tickets = tickets;
        this.theater = theater;
    }

    public void run() {
        theater.reserveSeats(customerNumber, tickets);
    }
}

