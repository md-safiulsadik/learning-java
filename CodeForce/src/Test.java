
import java.util.*;


public class Test {

    public static void main(String[] args) {
        // test your method here
        List<String> names = new ArrayList<>();

        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));

        Map<String, String> map = new HashMap<>();
        map.put("ganbatte", "good luck");
        map.put("hai", "yes");

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }


        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");

        for (String element: set) {
            System.out.println(element);
        }

        System.out.println(returnSize(names));
        System.out.println(returnSize(map));
        System.out.println(returnSize(set));


    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
    public static int returnSize(List<String> list) {
        return list.size();
    }


    public static int returnSize(Map<String, String> map) {
        return map.size();
    }

    public static int returnSize(Set<String> set) {
        return set.size();
    }

}
