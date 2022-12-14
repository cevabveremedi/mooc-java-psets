
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> numbers = new ArrayList<>();
        int index = 0, sum = 0;

        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1){
                break;
            } else {
                numbers.add(num);
            }
        }
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            index++;
        }
        System.out.println(sum / (index * 1.0));
    }
}
