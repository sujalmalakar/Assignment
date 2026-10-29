import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = Integer.parseInt(reader.nextLine());

        System.out.print("Enter end: ");
        int end = Integer.parseInt(reader.nextLine());

        for (int number = start; number <= end; number++) {
            boolean prime = true;

            if (number < 2) {
                prime = false;
            }

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                }
            }

            if (prime) {
                System.out.println(number);
            }
        }

        reader.close();
    }
}
