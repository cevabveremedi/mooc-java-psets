
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String sentence = scanner.nextLine();
            if(sentence.equals("")){
                break;
            }else {
                String[] words = sentence.split(" ");
                for(int i = 0; i < words.length; i++) {
                    if(words[i].contains("av")){
                        System.out.println(words[i]);
                    }
                }
            }
        }

    }
}
