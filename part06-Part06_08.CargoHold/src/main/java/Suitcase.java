import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> list;
    private int maxWeight;

    public Suitcase(int max) {
        list = new ArrayList<>();
        this.maxWeight = max;
    }

    public void addItem(Item item) {
        if(totalWeight() + item.getWeight() <= this.maxWeight)
            list.add(item);
    }

    public String toString() {
        if(list.size() == 0)
            return "no items (0 kg)";
        else if (list.size() == 1)
            return "1 item (" + totalWeight() + " kg)";
        else
            return list.size() + " items (" + totalWeight() + " kg)";
    }

    public int totalWeight() {
        int total = 0;
        for(Item element : list)
            total += element.getWeight();
        return total;
    }

    public void printItems() {
        for(Item element : list) {
            System.out.println(element.getName() + "(" + element.getWeight() + " kg)");
        }
    }

    public Item heaviestItem() {
        if(list.isEmpty())
            return null;

        Item heaviest = list.get(0);

        for(Item element : list) {
            if(element.getWeight() > heaviest.getWeight())
                heaviest = element;
        }

        return heaviest;
    }
}