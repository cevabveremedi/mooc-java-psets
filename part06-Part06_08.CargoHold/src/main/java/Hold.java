import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> list;

    public Hold(int max) {
        this.maxWeight = max;
        list = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currWeight = 0;
        for(Suitcase scase : list)
            currWeight += scase.totalWeight();

        if(suitcase.totalWeight() + currWeight <= this.maxWeight)
            list.add(suitcase);
    }

    public String toString() {
        int currWeight = 0;
        for(Suitcase scase : list)
            currWeight += scase.totalWeight();
        return list.size() + " suitcases (" + currWeight + " kg)";
    }

    public void printItems() {
        for(Suitcase cases : list)
            cases.printItems();
    }
}