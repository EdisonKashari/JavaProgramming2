package day_33_Statics.day_33_Statics;

public class CircleObject {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);
        circle1.printPi();
        System.out.println(circle1);
        System.out.println(circle1.calcArea());
        System.out.println(circle1.diameter);
        System.out.println(circle1.calcPerimeter());

    }
}
