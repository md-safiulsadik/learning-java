import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // Test the final sorting method
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);
    }

    // Part 1: Find the smallest number in the array
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    // Part 2: Find the index of the smallest number in the array
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    // Part 3: Find the index of the smallest number from a given start index
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    // Part 4: Swap two elements in the array
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Part 5: Sort the array using selection sort and print after each swap
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array)); // Print before sorting

        for (int i = 0; i < array.length; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }
    }
}
