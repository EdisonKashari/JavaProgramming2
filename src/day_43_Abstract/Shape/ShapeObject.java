package day_43_Abstract.Shape;

public class ShapeObject {
    public static void main(String[] args) {
        Reactangle reactangle = new Reactangle(25.5,14.5);

        System.out.println(reactangle);
        Square square = new Square(15.5);

        System.out.println(square);

        Circle circle = new Circle(14.5);

        System.out.println(circle);
    }
}
