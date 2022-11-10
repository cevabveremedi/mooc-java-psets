import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while(true) {
            System.out.println("Command: ");
            String cmd = scanner.nextLine();
            if(cmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if(cmd.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                simpleDictionary.add(word, translation);
                continue;
            } else if(cmd.equals("search")) {
                System.out.println("To be translated: ");
                String word = scanner.nextLine();
                if(simpleDictionary.translate(word) == null)
                    System.out.println("Word " + word + " was not found");
                else
                    System.out.println(simpleDictionary.translate(word));
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
