
public class Sum {

    private int x;
    private int y;
    private int z;

    public Sum(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getSum() {
        return x + y + z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Sum: " + getSum();
    }
}
