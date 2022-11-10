
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] data = input.split(" ");
            int value = Integer.valueOf(data[1]);

            if(data[0].equals("add"))
                first.add(value);
            else if(data[0].equals("move")){
                if(first.contains() < value)
                    value = first.contains();
                second.add(value);
                first.remove(value);
            } else
                second.remove(value);
        }
    }

}
