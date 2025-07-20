
public class Statistics {
    private int count = 0;
    private int sum = 0;
    
    public Statistics() {
        // initialize the variable numberCount here
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        // write code here
        this.count += 1;
        this.sum += number;
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    
    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        if (this.count == 0) {
            return 0;
        }
        return (double)this.sum / this.count;
    }
}
