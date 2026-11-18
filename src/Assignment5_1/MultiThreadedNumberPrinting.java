
public class MultiThreadedNumberPrinting {

    public static void main(String[] args) {

        int maxNumber = 20;

        NumberPrinter printer = new NumberPrinter(maxNumber);

        Thread oddThread = new OddThread(printer);
        Thread evenThread = new EvenThread(printer);

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Program interrupted");
        }

        System.out.println("Printing complete.");
    }
}

class NumberPrinter {

    private int number = 1;
    private int maxNumber;

    public NumberPrinter(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public synchronized void printNumbers(boolean odd) {

        while (number <= maxNumber) {

            while (number <= maxNumber && (number % 2 == 0) == odd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    return;
                }
            }

            if (number <= maxNumber) {

                if (odd) {
                    System.out.println("Odd Thread: " + number);
                } else {
                    System.out.println("Even Thread: " + number);
                }

                number++;
                notifyAll();
            }
        }
    }
}

class OddThread extends Thread {

    private NumberPrinter printer;

    public OddThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printNumbers(true);
    }
}

class EvenThread extends Thread {

    private NumberPrinter printer;

    public EvenThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printNumbers(false);
    }
}

