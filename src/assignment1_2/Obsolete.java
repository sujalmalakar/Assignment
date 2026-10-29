import java.util.Scanner;

public class Obsolete {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double grams = Double.parseDouble(reader.nextLine());

        double luoti = grams / 13.28;

        int leiviska = (int) (luoti / 640);
        luoti = luoti - leiviska * 640;

        int naula = (int) (luoti / 32);
        luoti = luoti - naula * 32;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviska, naula, luoti);

        reader.close();
    }
}
