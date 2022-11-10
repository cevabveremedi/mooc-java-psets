import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while(true) {
            System.out.println("Command: ");
            String cmd = scanner.nextLine();

            if(cmd.equals("stop")) {
                break;
            } else if(cmd.equals("add")) {
                System.out.println("To add: ");
                String todo = scanner.nextLine();
                list.add(todo);
            } else if(cmd.equals("list")) {
                list.print();
            } else if(cmd.equals("remove")) {
                System.out.println("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                list.remove(number);
            } else {
                System.out.println("Error");
            }
        }
    }
}
