package storeManager;

import myStorePackage.Book;
import myStorePackage.Clothing;
import myStorePackage.Electronics;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;
    private final StoreManager storeManager;

    public UserInterface(Scanner scanner, StoreManager storeManager) {
        this.scanner = scanner;
        this.storeManager = storeManager;
    }

    public void start() {
        while (true) {
            displayUI();
            int choice = getIntegerInput("Enter your choice: ");

            if (choice == 5) {
                System.out.println("Exiting... Thank you for using Online Shopping Store! \nMade with ❤\uFE0F by @md-safiulsadik");
                break;
            }

            switch (choice) {
                case 1:
                    adder();
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    storeManager.displayProducts();
                    break;
                case 3:
                    System.out.print("Enter product name to search: ");
                    String name = scanner.nextLine();
                    storeManager.search(name);
                    break;
                case 4:
                    storeManager.totalPrice();
                    break;
                default:
                    System.out.println("Invalid choice ⚠\uFE0F \nPlease enter a number between 1 and 5⁉\uFE0F");
            }
        }
    }

    public void displayUI() {
        System.out.println("\n====== Online Shopping Store ======\n" +
                "1. Add Product\n" +
                "2. Display All Products\n" +
                "3. Search Product by Name\n" +
                "4. Calculate Total Price\n" +
                "5. Exit");
    }

    private void adder() {
        int choice = getIntegerInput("Enter Product Type (1. Electronics, 2. Clothing, 3. Book): ");

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid product type choice ⚠\uFE0F \nPlease enter 1, 2, or 3 ⁉\uFE0F");
            return;
        }

        if (choice == 1) {
            storeManager.add(electric());
        } else if (choice == 2) {
            storeManager.add(clothing());
        } else {
            storeManager.add(book());
        }
    }

    private Book book() {
        String id;
        String name;
        float price;

        System.out.print("Enter Product ID: ");
        id = scanner.nextLine();

        System.out.print("Enter Product Name: ");
        name = scanner.nextLine();

        price = getFloatInput("Enter Product price: ");

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        return new Book(id, name, price, author);
    }

    private Clothing clothing() {
        String id, name;
        float price;

        System.out.print("Enter Product ID: ");
        id = scanner.nextLine();

        System.out.print("Enter Product Name: ");
        name = scanner.nextLine();

        price = getFloatInput("Enter Product price: ");

        System.out.print("Enter size: ");
        String size = scanner.nextLine();

        return new Clothing(id, name, price, size);
    }

    private Electronics electric() {
        String id;
        String name;
        float price;
        int year;

        System.out.print("Enter Product ID: ");
        id = scanner.nextLine();

        System.out.print("Enter Product Name: ");
        name = scanner.nextLine();

        price = getFloatInput("Enter Product price: ");

        year = getIntegerInput("Enter Warranty Period (in years): ");

        return new Electronics(id, name, price, year);
    }


    /**
     * Helper method to get a validated integer input from the user.
     * @return A valid integer entered by the user.
     */
    private int getIntegerInput(String prompt) {
        int value = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            String inputLine = scanner.nextLine();
            try {
                value = Integer.parseInt(inputLine);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input ⚠\uFE0F \nPlease enter a whole number ⁉\uFE0F");
            }
        }
        return value;
    }

    /**
     * Helper method to get a validated float input from the user.
     * @return A valid float entered by the user.
     */
    private float getFloatInput(String prompt) {
        float value = 0.0f;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            String inputLine = scanner.nextLine();
            try {
                value = Float.parseFloat(inputLine);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input ⚠\uFE0F \nPlease enter a number with or without decimals ⁉\uFE0F");
            }
        }
        return value;
    }
}








// This is without type safety and has some bugs

//package storeManager;
//
//import myStorePackage.Book;
//import myStorePackage.Clothing;
//import myStorePackage.Electronics;
//import java.util.Scanner;
//
//public class UserInterface {
//
//    private final Scanner scanner;
//    private final StoreManager storeManager;
//
//    public UserInterface(Scanner scanner, StoreManager storeManager) {
//        this.scanner = scanner;
//        this.storeManager = storeManager;
//    }
//
//    public void start() {
//        while (true) {
//            displayUI();
//            int choice = Integer.valueOf(scanner.nextLine());
//
//            if (choice == 5) {
//                System.out.println("Exiting... Thank you for using Online Shopping Store!");
//                break;
//            }
//
//            switch (choice) {
//                case 1:
//                    adder();
//                    break;
//                case 2:
//                    storeManager.displayProducts();
//                    break;
//                case 3:
//                    System.out.print("Enter product name to search: ");
//                    String name = scanner.nextLine();
//                    storeManager.search(name);
//                    break;
//                case 4:
//                    storeManager.totalPrice();
//                    break;
//                default:
//                    System.out.println("Invalid choice! :(");
//            }
//        }
//    }
//
//    public void displayUI() {
//        System.out.println("====== Online Shopping Store ======\n" +
//                "1. Add Product\n" +
//                "2. Display All Products\n" +
//                "3. Search Product by Name\n" +
//                "4. Calculate Total Price\n" +
//                "5. Exit");
//        System.out.print("Enter your choice: ");
//    }
//
//    private void adder() {
//        System.out.print("Enter Product Type (1. Electronics, 2. Clothing, 3. Book): ");
//        int choice = Integer.valueOf(scanner.nextLine());
//
//        if (choice < 1 || choice > 3) {
//            System.out.println("Invalid choice");
//        }
//
//        if (choice == 1) {
//            storeManager.addElectric(electric());
//        }
//
//        if (choice == 2) {
//            storeManager.addClothing(clothing());
//        }
//
//        if (choice == 3) {
//            storeManager.addBook(book());
//        }
//    }
//
//
//    private Book book() {
//        String id;
//        String name;
//        float price;
//
//        System.out.print("Enter Product ID: ");
//        id = scanner.nextLine();
//
//        System.out.print("Enter Product Name: ");
//        name = scanner.nextLine();
//
//        System.out.print("Enter Product price: ");
//        price = Integer.valueOf(scanner.nextLine());
//
//        System.out.print("Enter author: ");
//        String author = scanner.nextLine();
//
//        return new Book(id, name, price, author);
//    }
//
//    private Clothing clothing() {
//        String id, name;
//        float price;
//
//        System.out.print("Enter Product ID: ");
//        id = scanner.nextLine();
//
//        System.out.print("Enter Product Name: ");
//        name = scanner.nextLine();
//
//        System.out.print("Enter Product price: ");
//        price = Integer.valueOf(scanner.nextLine());
//
//        System.out.print("Enter size: ");
//        String size = scanner.nextLine();
//
//        return new Clothing(id, name, price, size);
//    }
//
//    private Electronics electric() {
//        String id;
//        String  name;
//        float price;
//
//        System.out.print("Enter Product ID: ");
//        id = scanner.nextLine();
//
//        System.out.print("Enter Product Name: ");
//        name = scanner.nextLine();
//
//        System.out.print("Enter Product price: ");
//        price = Integer.valueOf(scanner.nextLine());
//
//        System.out.print("Enter Warranty Period (in years): ");
//        int year = Integer.valueOf(scanner.nextLine());
//
//        return new Electronics(id, name, price, year);
//    }
//
//}
