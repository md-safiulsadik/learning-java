public class Rectangle extends Shape{

    double height;
    double width;

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    double area() {
        return this.height * this.width;
    }
}
