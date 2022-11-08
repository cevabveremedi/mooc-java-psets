
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        int teamGameCount = 0;
        int teamWinCount = 0;
        int teamLossCount = 0;

        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            while(fileReader.hasNextLine()){
                String row = fileReader.nextLine();
                String[] data = row.split(",");
                if(data[0].equals(teamName) || data[1].equals(teamName)) {
                    teamGameCount++;
                    if(data[0].equals(teamName)){
                        if(Integer.valueOf(data[2]) > Integer.valueOf(data[3])){
                            teamWinCount++;
                        } else {
                            teamLossCount++;
                        }
                    } else {
                        if(Integer.valueOf(data[2]) < Integer.valueOf(data[3])){
                            teamWinCount++;
                        } else {
                            teamLossCount++;
                        }
                    }
                }
            }

            System.out.println("Games: " + teamGameCount);
            System.out.println("Wins: " + teamWinCount);
            System.out.println("Losses: " + teamLossCount);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
