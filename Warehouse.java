import java.util.ArrayList;

public class Warehouse {
    private int id;
    private String location;
    private int capacity;
    private ArrayList<Product> products;

    public String getLocation() {
        return location;
    }
    private ArrayList<StockMove> stockMoves;

    public int getId() {
        return id;
    }

    public Warehouse(int id, String location, int capacity) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
        this.products = new ArrayList<>();
        this.stockMoves = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (products.size() < capacity) {
            products.add(product);
            System.out.println("Бүтээгдэхүүн агуулахад нэмэгдлээ.");
        } else {
            System.out.println("Агуулах дүүрэн байна!");
        }
    }

    public void removeProduct(Product product) {
        if (products.remove(product)) {
            System.out.println("Бүтээгдэхүүн устгагдлаа.");
        } else {
            System.out.println("Бүтээгдэхүүн олдсонгүй.");
        }
    }

    public void listProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void addStockMove(StockMove move) {
        stockMoves.add(move);
    }

    public void listStockMoves() {
        for (StockMove move : stockMoves) {
            System.out.println(move);
        }
    }
}
