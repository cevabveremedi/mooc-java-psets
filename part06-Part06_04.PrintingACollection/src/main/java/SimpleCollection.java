
import java.util.ArrayList;

import javax.swing.event.PopupMenuEvent;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if(elements.isEmpty())
            return "The collection " + this.name +" is empty.";
        
        String out = "The collection " + this.name +" has "+ elements.size();
        
        if(elements.size() == 1)
            out += " element:";
        else
            out += " elements:";
        
        for(String items: elements)
            out += "\n" + items;

        return out;
    }
}
