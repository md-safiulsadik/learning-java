import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array = a collection of values of the same data type
        //              * think of it as a variable that can store more than 1 value *

//        String[] fruits = {"apple", "orange", "banana", "coconut"};
//        int len = fruits.length;
//        Arrays.sort(fruits);
        // Arrays.fill(fruits, "COOL");
//        for (String fruit : fruits) {
//            System.out.print(fruit + ' ');
//
//        }
//        System.out.println();
//



        // Insert data in a array ->

//        String[] words;
//        int size;
//        System.out.printf("Enter the size of the array: ");
//        size = Integer.valueOf(scanner.nextLine());
//        words = new String[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.printf("Enter a name: ");
//            words[i] = scanner.nextLine();
//        }
//        for (String word : words) {
//            System.out.println(word);
//        }




        // Search in an array

//        int[] numbers;
//        numbers = new int[]{1, 2, 4, 6, 7, 8, 9};
//
//        int number = Integer.valueOf(scanner.nextLine());
//        int index = find_number(numbers, number);
//        if (index == 0) {
//            System.out.println("Number NOT in the Array!");
//        }
//        else {
//            System.out.println("Number found at index " + index);
//        }
//
//
//        String[] fruits;
//        fruits = new String[]{"apple", "orange", "banana", "coconut"};
//        String fruit = scanner.nextLine();
//
//        int f_index = find_fruits(fruits, fruit);
//        if (f_index == 0) System.out.println("Fruit NOT found");
//        else System.out.println("Fruit found at index " + f_index);




        // varargs = allow a method to accept a varying # of arguments
        //                  makes methods more flexible, no need for overloaded methods
        //                  java will pack the arguments into an array
        //                  ... (ellipsis)


        System.out.println(average(1, 2, 3, 4, 5, 7, 8, 9, 23, 52));



        scanner.close();
    }


    static int find_number(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) return i;
        }
        return 0;
    }


    static int find_fruits(String[] fruits, String fruit) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(fruit)) return i;
        }
        return 0;
    }


    static double average(double... numbers){

        double sum = 0;
        if(numbers.length == 0){
            return 0;
        }
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }


}
