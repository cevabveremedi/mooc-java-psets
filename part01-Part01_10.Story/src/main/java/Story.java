
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\nWhat is the main character called?");
        String inputOne = scanner.nextLine();
        System.out.println("What is their job?");
        String inputTwo = scanner.nextLine();
        System.out.println("Here is the story:\nOnce upon a time there was "+ inputOne +", who was " + inputTwo +".\nOn the way to work, "+ inputOne +" reflected on life.\nPerhaps "+ inputOne +" will not be "+ inputTwo +" forever.");

    }
}
