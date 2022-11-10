/*
 * This code is AWFUL.
 * I've changed my mind while implementing the classes
 * so it became a spagetti code. Maybe I'll optimise it later.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Grades grades = new Grades();

        while(true) {
            System.out.println("Enter point totals, -1 stops: ");
            int input = Integer.valueOf(scanner.nextLine());

            if(input == -1)
                break;
            if(input < 0 || input > 100)
                continue;
            else
                grades.add(input);
        }
        System.out.print("Point average (all): ");
        System.out.println(grades.average());
        System.out.print("Point average (passing): ");
        if(grades.passingAverage() == -1)
            System.out.println("-");
        else
            System.out.println(grades.passingAverage());
        System.out.print("Pass percentage: ");
        System.out.println((grades.totalPassing(grades.distribute()) * 100.0) / grades.totalParticipant());
        System.out.println("Grade distribution:");
        grades.draw(grades.distribute());
    }
}
