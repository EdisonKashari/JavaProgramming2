package day_04_Variables;

public class Circle {
    public static void main (String[] args){

        double radius = 5.5;
        double PI = 3.14;
        double diameter = radius * 2; // find the dia by multiplying the radius to 2
        double perimeter = diameter * PI;// finds the perimeter of thr circle
        double area = PI * radius * radius;// finds the area of the circle


        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);



    }
}
