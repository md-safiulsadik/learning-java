
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(100);
        
        counter.increase(100);
        counter.decrease(-50);
        
        System.out.println(counter);
    }
}
