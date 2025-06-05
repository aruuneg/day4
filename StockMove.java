import java.time.LocalDateTime;

public class StockMove {
    private int id;
    private Product product;
    private int quantity;
    private String moveType;
    private LocalDateTime timestamp;
    private Location fromLocation;
    private Location toLocation;

    public StockMove(int id, Product product, int quantity, String moveType, Location fromLocation, Location toLocation) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.moveType = moveType;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.timestamp = LocalDateTime.now();
    }

    public String toString() {
        return "[" + id + "] " + moveType.toUpperCase() + " - " + product.getName() + 
               ", Тоо: " + quantity + ", Цаг: " + timestamp +
               ", FROM: " + (fromLocation != null ? fromLocation.getName() : "N/A") +
               ", TO: " + (toLocation != null ? toLocation.getName() : "N/A");
    }
}
