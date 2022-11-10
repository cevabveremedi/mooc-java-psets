
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } 
            String[] data = input.split(" ");
            int value = Integer.valueOf(data[1]);
            if(value < 0 )
                continue;
            if(data[0].equals("add")) {
                if(first + value <= 100)
                    first += value;
                else
                    first = 100;
            } else if(data[0].equals("move")) {
                if(first == 0)
                    continue;
                if(value > first) {
                    value = first;
                    first = 0;
                } else
                    first -= value;

                if(second + value > 100)
                    second = 100;
                else
                    second += value;
            } else if(data[0].equals("remove")) {
                if(value > second)
                    second = 0;
                else
                    second -= value;
            } else {
                System.out.println("Error");
            }
        }
    }

}
