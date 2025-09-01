
import java.util.HashMap;
import java.util.Map;



public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> map = new HashMap<>();
        map.put("ganbatte", "good luck");
        map.put("hai", "yes");
        
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map map) {
        return map.size();
    }
}
