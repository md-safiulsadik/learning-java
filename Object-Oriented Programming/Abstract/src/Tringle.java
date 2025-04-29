public class Tringle extends Shape{

    double base;
    double height;

    Tringle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * this.base * this.height;
    }
}
