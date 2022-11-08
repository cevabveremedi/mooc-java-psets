
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while(true) {
            String sentence = scanner.nextLine();
            if(sentence.equals("")){
                break;
            } else {
                String[] words = sentence.split(",");
                int age = Integer.valueOf(words[1]);
                if(oldest < age) {
                    oldest = age;
                    name = words[0];
                }
            }
        }
        System.out.println(name);
    }
}
