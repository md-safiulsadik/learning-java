
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
 

        try {
            List<Literacy> rates = Files.lines(Paths.get("literacy.csv"))
                    .map(parts -> parts.split(","))
                    .map(parts -> new Literacy(
                            parts[2].replace("(%)", "").trim(),
                            parts[3].trim(),
                            Integer.parseInt(parts[4]),
                            Double.parseDouble(parts[5])
                    ))
                    .collect(Collectors.toList());
                    
            rates.stream()
                    .sorted((s1, s2) -> Double.compare(s1.getRate(), s2.getRate()))
                    .forEach(System.out::println);
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
