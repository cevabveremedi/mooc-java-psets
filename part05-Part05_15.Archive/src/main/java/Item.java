public class Item {
    private String identifier;
    private String name;

    public Item(String id, String name) {
        this.identifier = id;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }

        if(!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        if(this.name.equals(comparedItem.name)
            && this.identifier.equals(comparedItem.identifier)) {
            return true;
        }

        return false;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
