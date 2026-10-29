public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker maker = new CoffeeMaker();

        maker.pressOnOff();
        System.out.println("Coffee maker is on");

        maker.setCoffeeType("espresso");
        System.out.println("Coffee type is " + maker.getCoffeeType());

        maker.setCoffeeAmount(50);
        System.out.println("Coffee amount is " + maker.getCoffeeAmount() + " ml");

        maker.pressOnOff();
        System.out.println("Coffee maker is off");
    }
}
