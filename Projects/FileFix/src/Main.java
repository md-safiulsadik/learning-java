import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        String path;

//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.print("Enter file path: ");
//            path = scanner.nextLine();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return;
//        }

        StringBuilder text = new StringBuilder();
        String path = "/home/md-safiulsadik/Downloads/Road Map DeepSeek.txt";

        try (Scanner fileReader = new Scanner(Paths.get(path))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                line = line.replace("#", "").replace("*", " ").
                        replace("-", "--");
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("new " + "Road Map DeepSeek.txt"))) {
            writer.write(text.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}