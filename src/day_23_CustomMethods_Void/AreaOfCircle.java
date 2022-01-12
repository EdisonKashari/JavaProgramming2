package day_23_CustomMethods_Void;

public class AreaOfCircle {
    public static void main(String[] args) {
areaOfCircle(5.15);
    }
    public static void areaOfCircle(double radius){
        double Pi = 3.14;
        double area = Pi * radius*radius;
        System.out.println(area);
    }
}
/* create a method that can calculate the area of a circle*/