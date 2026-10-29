import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int score = 0;

        while (score < 10) {
            score = 0;

            for (int i = 1; i <= 10; i++) {
                int a = (int) (Math.random() * 10) + 1;
                int b = (int) (Math.random() * 10) + 1;

                System.out.print(a + " * " + b + " = ");
                int answer = Integer.parseInt(reader.nextLine());

                if (answer == a * b) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The answer is " + (a * b));
                }
            }

            System.out.println("Your score: " + score);

            if (score == 10) {
                System.out.println("Congratulations! You mastered the multiplication tables!");
            }
        }

        reader.close();
    }
}