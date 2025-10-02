
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while (true) {
            
            System.out.print("Input the name of the book, empty stops: ");
            // String 
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            int age = 0;
            // Interger input
            while (true) {
                System.out.print("Input the age recommendation: ");
                try {
                    age = Integer.parseInt(scanner.nextLine());
                    break;
                    
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                    
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            
            books.add(new Book(name, age));
        }
        
//        books.stream().sorted((p1, p2) -> {
//                    return p1.getAge() - p2.getAge();
//                })
//                .forEach(System.out::println);
        
         System.out.println(books.size() + " books in total.");
    
//        Comparator<Book> comparator = Comparator
//                .comparing(Book::getAge)
//                .thenComparing(Book::getName);
        
//        Collections.sort(books, comparator);
        
        System.out.println("Books: ");
        books.stream()
                .sorted(Comparator.comparing(Book::getAge)
                                .thenComparing(Book::getName))
                .forEach(System.out::println);
    }
}
