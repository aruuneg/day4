public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(int id, String name, String category, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return "[" + id + "] " + name + " (" + category + ") - ₮" + price + ", Тоо: " + quantity;
    }

    public String getName() {
        return name;
    }
}
