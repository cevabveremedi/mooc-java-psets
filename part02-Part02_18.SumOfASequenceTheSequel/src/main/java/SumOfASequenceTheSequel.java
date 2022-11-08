
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int numberOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int numberTwo = Integer.valueOf(scanner.nextLine());
        int total = 0;
        for(int i = numberOne; i <= numberTwo; i++) {
            total += i;
        }
        System.out.println(total);
    }
}
