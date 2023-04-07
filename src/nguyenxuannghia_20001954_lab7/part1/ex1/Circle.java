package nguyenxuannghia_20001954_lab7.part1.ex1;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[" +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "], radius=" + radius +
                "]";
    }
}
