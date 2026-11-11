
package Assignment3_4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FibonacciCSV {

    public static void main(String[] args) {

        long first = 0;
        long second = 1;

        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("fibonacci.csv"));

            for (int i = 1; i <= 60; i++) {

                writer.write(String.valueOf(first));
                writer.newLine();

                long next = first + second;
                first = second;
                second = next;
            }

            writer.close();

            System.out.println("60 Fibonacci numbers saved successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

