package nguyenxuannghia_20001954_lab7.part1.ex2;

public class Circle implements GeometricObject {

    final private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius="
                + radius + ']';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
