public class ProductInventory {
    public static void main(String[] args) {

        Product p1 = new Product("P101", "Laptop", 50000);
        Product p2 = new Product("P102", "Mouse", 800, 10);
        Product p3 = new Product("P103", "Keyboard", 1500, 5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.restock(2);
        p2.sell(3);

        System.out.println("\nAfter operations:");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\nProduct count: " + Product.getProductCount());
    }
}
