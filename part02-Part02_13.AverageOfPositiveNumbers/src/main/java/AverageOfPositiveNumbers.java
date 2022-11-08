
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSum = 0;
        int numberTotal = 0;
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number < 0) {
                continue;
            } else {
                numberTotal++;
                numberSum += number;
            }
        }
        if (numberTotal == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((1.0 * numberSum) / numberTotal);
        }
    }
}
