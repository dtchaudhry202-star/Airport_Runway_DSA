class ShoppingCartDemo {

    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 1000);
        Product p2 = new Product(2, "Mouse", 20);
        Product p3 = new Product(3, "Keyboard", 50);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(p1, 1);
        cart.addProduct(p2, 2);
        cart.addProduct(p3, 1);

        cart.displayCart();

        cart.updateQuantity(p2, 5);

        System.out.println("\nAfter Updating Mouse Quantity:");
        cart.displayCart();

        cart.removeProduct(p3);

        System.out.println("\nAfter Removing Keyboard:");
        cart.displayCart();
    }
}