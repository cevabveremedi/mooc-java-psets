
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageSum = 0;
        int totalInput = 0;
        String longestName = "A";
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            } else {
                totalInput++;
                String[] data = input.split(",");
                ageSum += Integer.valueOf(data[1]);
                int nameLen = data[0].length();
                if(nameLen > longestName.length()) {
                    longestName = data[0];
                }
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (ageSum * 1.0) / totalInput);
    }
}
