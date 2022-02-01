package day_43_Abstract.Shape;

public class Reactangle  extends Shape {

    private double length,widh;



    public double getHeight() {
        return length;
    }

    public void setHeight(double height) {
        this.length = height;
    }

    public double getWidh() {
        return widh;
    }

    public void setWidh(double widh) {
        this.widh = widh;


    }

    public Reactangle(double height, double widh) {
        super("Rectangle");
        this.length = height;
        this.widh = widh;
    }

    @Override
    public double area() {
        return widh * length;
    }

    @Override
    public double perimeter() {
        return 2 * (widh+length);
    }

    @Override
    public String toString() {
        return "Reactangle{" +
                "height=" + length +
                ", widh=" + widh +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}

/*

Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)
 */
