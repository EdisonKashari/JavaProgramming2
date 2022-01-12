package day_09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 120;
        int b = 115 ;
        int c = 110 ;
        //
        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
        boolean bIsMedian = (b>a && b<c) || (b>c && b<a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println(a + " is median number");
        }
        if (bIsMedian){
            System.out.println(b + " is median number");
        }
        if (cIsMedian){
            System.out.println(c + " is median number");
        }






















        /* Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number */




    }
}
