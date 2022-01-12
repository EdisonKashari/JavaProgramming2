package day_12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();

        String result ="";

        double area =3.14 * radius * radius;

        double perimeter = 2 * radius * 3.14;

        System.out.println("area =" + area);
        System.out.println("perimeter =" +perimeter);

        input.close();


        /* Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius*/


        /*double radius = 5.5;
        double PI = 3.14;
        double diameter = radius * 2; // find the dia by multiplying the radius to 2
        double perimeter = diameter * PI;// finds the perimeter of thr circle
        double area = PI * radius * radius;// finds the area of the circle */




    }
}
