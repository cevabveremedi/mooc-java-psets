
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int numberOne = Integer.valueOf(scanner.nextLine());
        /*for(int i = 1; i <= numberOne; i++){
            System.out.println(i);
        } */
        System.out.println("Where from?");
        int numberTwo = Integer.valueOf(scanner.nextLine());
        for(int i = numberTwo; i <= numberOne; i++){
            System.out.println(i);
        }
    }
}
