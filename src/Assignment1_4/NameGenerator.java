import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] firstNames = {"Alex", "Emma", "John", "Anna", "Lucas"};
        String[] lastNames = {"Smith", "Brown", "Wilson", "Taylor", "Miller"};

        System.out.print("How many names to generate? ");
        int amount = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < amount; i++) {
            int first = (int) (Math.random() * firstNames.length);
            int last = (int) (Math.random() * lastNames.length);

            System.out.println(firstNames[first] + " " + lastNames[last]);
        }

        reader.close();
    }
}