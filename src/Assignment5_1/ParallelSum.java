
import java.util.Random;

class SumThread extends Thread {

    private int[] numbers;
    private int start;
    private int end;
    private long sum;

    public SumThread(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        sum = 0;
    }

    public void run() {

        for (int i = start; i < end; i++) {
            sum = sum + numbers[i];
        }
    }

    public long getSum() {
        return sum;
    }
}

public class ParallelSum {

    public static void main(String[] args) {

        int[] numbers = new int[100000];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int numberOfThreads = Runtime.getRuntime().availableProcessors();

        System.out.println("Number of processor cores: " + numberOfThreads);

        SumThread[] threads = new SumThread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {

            int start = i * numbers.length / numberOfThreads;
            int end = (i + 1) * numbers.length / numberOfThreads;

            threads[i] = new SumThread(numbers, start, end);

            threads[i].start();
        }

        long totalSum = 0;

        for (int i = 0; i < numberOfThreads; i++) {

            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            totalSum = totalSum + threads[i].getSum();
        }

        System.out.println("Total sum: " + totalSum);
    }
}

