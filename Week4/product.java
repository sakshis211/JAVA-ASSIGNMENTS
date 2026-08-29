public class Product {
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;

    private static int productCount = 0;

    // Constructor with zero quantity
    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }

    // Constructor with supplied quantity
    public Product(String code, String name, double unitPrice, int quantity) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Code cannot be blank");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

        productCount++;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void restock(int amount) {
        if (amount <= 0) {
            return;
        }

        quantity += amount;
    }

    public boolean sell(int amount) {
        if (amount <= 0 || amount > quantity) {
            return false;
        }

        quantity -= amount;
        return true;
    }

    public double getInventoryValue() {
        return unitPrice * quantity;
    }

    public static int getProductCount() {
        return productCount;
    }

    
}
