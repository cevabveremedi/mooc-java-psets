import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;

    public Room() {
        list = new ArrayList<>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return list;
    }

    public Person shortest() {
        if(isEmpty())
            return null;

        Person shortest = list.get(0);

        for(Person i : list) {
            if(shortest.getHeight() > i.getHeight())
                shortest = i;
        }

        return shortest;
    }

    public Person take() {
        if(isEmpty())
            return null;
    
        int index = 0;
        Person shortest = list.get(index);

        for(int i = 1; i < list.size(); i++) {
            if(shortest.getHeight() > list.get(i).getHeight()) {
                shortest = list.get(i);
                index = i;
            }
        }

        list.remove(index);
        return shortest;
    }
}
