
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while(true) {
            System.out.print("? ");
            String cmd = scan.nextLine();

            if(cmd.equals("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String nameLatin = scan.nextLine();
                birds.add(new Bird(name, nameLatin));
            } else if(cmd.equals("Observation")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                for(Bird bird: birds) {
                    if(bird.getName().equals(name))
                        bird.observe();
                }
            } else if(cmd.equals("All")) {
                for(Bird bird: birds) {
                    System.out.println(bird);
                }
            } else if(cmd.equals("One")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                for(Bird bird: birds) {
                    if(bird.getName().equals(name))
                        System.out.println(bird);
                }
            } else if(cmd.equals("Quit")) {
                break;
            } else {
                System.out.println("Error");
                continue;
            }
        }
    }

}
