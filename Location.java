public class Location {
    private int id;
    private String name;

    public Location(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "[" + id + "] " + name;
    }

    public String getName() {
        return name;
    }
}
