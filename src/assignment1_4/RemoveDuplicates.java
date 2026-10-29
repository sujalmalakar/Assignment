import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(reader.nextLine());

        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(reader.nextLine());
        }

        int[] result = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (numbers[i] == result[j]) {
                    found = true;
                }
            }

            if (!found) {
                result[count] = numbers[i];
                count++;
            }
        }

        System.out.println("The array without duplicates:");

        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println();

        reader.close();
    }
}
