
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] data = row.split(",");
                data[0] = data[0] + ", ";
                if(Integer.valueOf(data[1]) == 1) {
                    data[1] = "age: " + data[1] + " year";
                } else {
                    data[1] = "age: " + data[1] + " years";
                }
                System.out.println(data[0] + data[1]);
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
