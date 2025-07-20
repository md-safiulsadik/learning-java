
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File: ");
        String fileName = scanner.nextLine();

        System.out.println("Team: ");
        String teamName = scanner.nextLine();
        int numOfGame = 0;
        int win = 0;
        int loss = 0;
        
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String home = parts[0];                
                String away = parts[1];
                int homeScr = Integer.valueOf(parts[2]);
                int awayScr = Integer.valueOf(parts[3]);
                
                if (home.equalsIgnoreCase(teamName) || away.equalsIgnoreCase(teamName)) {
                    numOfGame++;
                    
                    if ((home.equalsIgnoreCase(teamName) && homeScr > awayScr) ||
                        (away.equalsIgnoreCase(teamName) && awayScr > homeScr)) {
                        win++;
                    } else {
                       loss++;
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        
        System.out.println("Games: " + numOfGame);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
    }

}
