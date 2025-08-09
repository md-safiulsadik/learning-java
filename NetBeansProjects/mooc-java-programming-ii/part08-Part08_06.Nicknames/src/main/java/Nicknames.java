
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> object = new HashMap<>();
        
        object.put("Matthew", "Matt");
        object.put("Michael", "mix");
        object.put("Arthur", "Artie");

        System.out.println(object.get("Matthew"));
    }

}
