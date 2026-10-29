
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        Cat firstCat = new Cat("Billi");
        Cat secondCat = new Cat("Biralo");

        firstCat.meow();
        firstCat.meow();
        secondCat.meow();
        firstCat.meow();
    }
}
