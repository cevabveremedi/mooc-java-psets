import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String value) {
        list.add(value);
    }

    public ArrayList<String> values() {
        return list;
    }

    public String take() {
        String lastItem = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return lastItem;
    }

    
}
