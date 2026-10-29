import java.util.Scanner;

public class Quadratic{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = Double.parseDouble(reader.nextLine());

        System.out.print("Enter b: ");
        double b = Double.parseDouble(reader.nextLine());

        System.out.print("Enter c: ");
        double c = Double.parseDouble(reader.nextLine());

        double d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("a cannot be zero");
        } else if (d < 0) {
            System.out.println("No real roots");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }

        reader.close();
    }
}