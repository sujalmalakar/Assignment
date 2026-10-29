import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = reader.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }

        System.out.println("Decimal: " + decimal);

        reader.close();
    }
}
