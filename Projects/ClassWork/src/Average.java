public class Average extends Sum {

    public Average(int x, int y, int z) {
        super(x, y, z);
    }

    public double getAverage() {
        return (double) getSum() / 3;
    }

    @Override
    public String toString() {
        return "Average: " + getAverage();
    }
}
