import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Test: sort int array
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));  // [1, 3, 3, 5, 12, 99]

        // Test: sort string array
        String[] words = {"banana", "apple", "pear", "orange"};
        sort(words);
        System.out.println(Arrays.toString(words));  // [apple, banana, orange, pear]

        // Test: sort Integer ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 8, 3, 1, 5);
        
        sortIntegers(numbers);
        System.out.println(numbers);  // [1, 3, 5, 8]

        // Test: sort String ArrayList
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Zed", "Anna", "Mark");
        sortStrings(names);
        System.out.println(names);  // [Anna, Mark, Zed]
    }

    // Sort array of ints
    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    // Sort array of strings
    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    // Sort list of integers
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    // Sort list of strings
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
