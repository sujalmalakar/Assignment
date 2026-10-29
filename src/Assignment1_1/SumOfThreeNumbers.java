
import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the second integer: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the third integer: ");
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second + third;
        int product = first * second * third;
        double average = sum / 3.0;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
