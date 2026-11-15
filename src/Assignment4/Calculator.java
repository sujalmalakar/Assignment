
public class Calculator {

    private int total;

    public Calculator() {
        total = 0;
    }

    public void reset() {
        total = 0;
    }

    public void add(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        total = total + number;
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(10);
        calculator.add(20);
        calculator.add(30);

        System.out.println("Total: " + calculator.getTotal());

        calculator.reset();

        System.out.println("After reset: " + calculator.getTotal());
    }
}
