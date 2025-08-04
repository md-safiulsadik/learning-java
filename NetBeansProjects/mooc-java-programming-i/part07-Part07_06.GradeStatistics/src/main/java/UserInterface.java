
import java.util.Scanner;

class UserInterface {

    private Scanner scanner;
    private Manager manager;

    public  UserInterface(Manager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    
    public void start() {
        System.out.println("Enter point totals, -1 stops: ");
        
        while(true) {
            String point = scanner.next();

            if (point.equalsIgnoreCase("-1")) {
                break;
            }
            
            manager.addPoint(Integer.valueOf(point));
        }
        
        if (manager.getAverage() != -1) {
            System.out.println("Point average (all): " + manager.getAverage());
            System.out.println("Point average (passing): " + manager.getPassAverage());
            System.out.println("Pass percentage: " + manager.getPassPercent());
            manager.grades();
        }
        
    }

}