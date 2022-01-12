package day_09_IfStatements;

public class MaxNumber {

    public static void main(String[] args) {

        int a = 10, b = 15;

        boolean maxNumber = a>b;

        if (maxNumber){
            System.out.println("The Max number is: " + a);
        }else{
            System.out.println("The Max number is: " + b);
        }
    }
}
