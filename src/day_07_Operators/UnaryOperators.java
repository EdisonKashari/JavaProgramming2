package day_07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25;

        int num2 = -25;

        System.out.println(num1 < 0); // false
        System.out.println(num2 < 0); // true

        System.out.println("--------------------------------");

        int a = 5;
        ++a; // pre increment:increase the value by 1 right away

        System.out.println( a); //6

        a--; //pre decrement: decreases the value by 1 right away






        System.out.println(a);

        System.out.println("--------------------------");

        int b =100;

        System.out.println(b++); //pre increment:increases the value by 1 right away

        int c = 100;

        System.out.println(c++); // post increment:first passes the courrent value,then increases the value by 1
        System.out.println(c); //101

        System.out.println("--------------");


        int x = 200;

        System.out.println( --x ); //pre dercrement: decreases the value by 1 right away


        int d = 99;

        System.out.println(++d); // d = 100, 100
        System.out.println(d--); // d = 100 ,99
        System.out.println(--d); // d = 98 , 98
        System.out.println(d++); // d = 98 , 99




    }
}
