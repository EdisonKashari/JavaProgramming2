package day_35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public double pi;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            return;
        }

        this.radius = radius;
    }

    public Circle(double radius,double pi) {
        setRadius(radius);
        this.pi = pi;
    }

  public double calcArea(){
        return pi*(radius*radius);
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", calcArea=" +calcArea() +
                ", calcPerimeter=" + calcPerimeter() +
                '}';
    }
}
/*Create a class named Circle

            privtae variables:
                radius

            public variable:
                pi

             Encapsulate all the private fields

                     1. radius of the circle can not be zero or negative

             Add a constructor that can set the raidus of coircle when circle object is created

             Methods:
                 calcArea()
                 calcPerimeter()
                 toString()  */