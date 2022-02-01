package day_43_Abstract.Shape;

public class Circle extends Shape {

    private double radius;
    private static double pi=3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius=radius;
    }

    @Override
    public double area() {
        return radius*radius+pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                "radius=" + radius +
                '}';
    }
}
/*

				Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi
 */