package practice1;

public class Triangle extends Shape{
    private int breadth;
    private int height;

    public Triangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (0.5 * breadth * height);
    }
}
