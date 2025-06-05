public class Main {
    public static void main(String[] args) {
        Product item1 = new Product(1, "Гурил", "Хүнсний бараа", 3000.0, 100);
        Product item2 = new Product(2, "Өндөг10ш", "Хүнсний бараа", 5500.0, 50);
        Product item3 = new Product(3, "Талх", "Хүнсний бараа", 4000.0, 200);

        Warehouse warehouse = new Warehouse(101, "Төв агуулах", 5);
        warehouse.addProduct(item1);
        warehouse.addProduct(item2);
        warehouse.addProduct(item3);

        System.out.println("\nАгуулах дахь бараанууд:");
        warehouse.listProducts();

        Location loc1 = new Location(1, "Төв агуулах");
        Location loc2 = new Location(2, "Салбар агуулах");

        StockMove move1 = new StockMove(1, item1, 20, "Орсон", loc1, loc2);
        StockMove move2 = new StockMove(2, item2, 10, "Гарсан", loc2, loc1);
        StockMove move3 = new StockMove(3, item3, 30, "Орсон", null, loc1);

        warehouse.addStockMove(move1);
        warehouse.addStockMove(move2);
        warehouse.addStockMove(move3);

        System.out.println("\nБарааны хөдөлгөөн:");
        warehouse.listStockMoves();
    }
}
