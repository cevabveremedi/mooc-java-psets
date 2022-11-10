import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokes;

    public UserInterface(Scanner scanner, JokeManager jokes) {
        this.scanner = scanner;
        this.jokes = jokes;
    }

    public void start() {
        while(true) {
            String cmd = scanner.nextLine();

            if(cmd.equals("x")) {
                break;
            } else if(cmd.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            } else if(cmd.equals("2")) {
                System.out.println(jokes.drawJoke());
            } else if(cmd.equals("3")) {
                System.out.println("Printing the jokes.");
                jokes.printJokes();
            } else {
                System.out.println("error");
            }
        }
    }
}
