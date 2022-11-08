
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();

        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.equals("")) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.equals("")) {
                break;
            }

            Boolean found = false;
            for(Item anyItem:list) {
                if(id.equals(anyItem.getIdentifier())){
                    found = true;
                    break;
                }
            }
            
            if(!found) {
                list.add(new Item(id, name));
            }
        }

        System.out.println("==Items==");
        for(Item item:list) {
            System.out.println(item);
        }
    }
}
