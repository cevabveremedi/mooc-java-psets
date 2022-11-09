public class Item {
    private int weight;
    private String name;

    public Item(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return this.name;
    } //, which returns the item's name


    public int getWeight() {
        return this.weight;
    } //, which returns the item's weight


    public String toString() {
        return this.name + " (" + this.weight + " kg)";
}

}