
import java.util.HashMap;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();
    private HashMap<String, Integer> quantities = new HashMap<>();

    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.put(item, cost);
        categories.put(item, category);
        quantities.put(item, quantity);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
        categories.remove(item);
        quantities.remove(item);
    }

    public void updateQuantity(String item, int newQuantity) {
        if (quantities.containsKey(item)) {
            quantities.put(item, newQuantity);
        }
    }


    public void displayList() {
        System.out.println("Grocery List:");

        for (String item : groceryList.keySet()) {
            System.out.println(item + " - €" + groceryList.get(item)
                    + " - " + categories.get(item)
                    + " - Quantity: " + quantities.get(item));
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public double calculateTotalCost() {
        double total = 0;

        for (String item : groceryList.keySet()) {
            total += groceryList.get(item) * quantities.get(item);
        }

        return total;
    }

    public void displayByCategory(String category) {
        System.out.println(category + " items:");

        for (String item : groceryList.keySet()) {
            if (categories.get(item).equalsIgnoreCase(category)) {
                System.out.println(item + " - €" + groceryList.get(item)
                        + " - Quantity: " + quantities.get(item));
            }
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");

        for (String item : groceryList.keySet()) {
            if (quantities.get(item) > 0) {
                System.out.println(item + " - Quantity: " + quantities.get(item));
            }
        }
    }

    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();

        list.addItem("Apples", 2.50, "Fruit", 3);
        list.addItem("Milk", 1.80, "Dairy", 2);
        list.addItem("Bread", 2.20, "Bakery", 0);
        list.addItem("Bananas", 1.50, "Fruit", 4);

        list.displayList();

        System.out.println();
        list.displayByCategory("Fruit");

        System.out.println();
        list.displayAvailableItems();

        System.out.println();
        System.out.println("Is Milk in the grocery list? " + list.checkItem("Milk"));

        System.out.println();
        list.updateQuantity("Milk", 0);
        System.out.println("Updated Milk quantity to 0.");

        System.out.println();
        list.displayAvailableItems();

        System.out.println();
        System.out.println("Total cost: €" + list.calculateTotalCost());
    }
}

