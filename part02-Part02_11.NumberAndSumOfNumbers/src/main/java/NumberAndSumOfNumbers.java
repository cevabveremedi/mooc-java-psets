
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersTotal = 0;
        int inputTotal = 0;
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0) {
                break;
            } else {
                numbersTotal += number;
                inputTotal++;
            }
        }
        System.out.println("Number of numbers: " + inputTotal);
        System.out.println("Sum of the numbers: " + numbersTotal);
    }
}
