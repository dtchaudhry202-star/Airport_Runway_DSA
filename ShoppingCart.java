import java.util.HashMap;
import java.util.Map;

class ShoppingCart {

    private HashMap<Product, Integer> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public void updateQuantity(Product product, int quantity) {

        if (cart.containsKey(product)) {
            cart.put(product, quantity);
        }
    }

    public void removeProduct(Product product) {
        cart.remove(product);
    }

    public double calculateTotalCost() {

        double total = 0;

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }

        return total;
    }

    public int totalItems() {

        int total = 0;

        for (int quantity : cart.values()) {
            total += quantity;
        }

        return total;
    }

    public void displayCart() {

        System.out.println("\nSHOPPING CART");

        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {

            Product p = entry.getKey();
            int qty = entry.getValue();

            System.out.println(
                    p.getId() + " - " +
                            p.getName() +
                            " | Price: $" + p.getPrice() +
                            " | Qty: " + qty);
        }

        System.out.println("Total Items: " + totalItems());
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}