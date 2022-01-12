package day_04_01_08_2022;

public class Calculator {

    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int substract(int num1,int num2){
        return num1-num2;
    }

    public static int multiply(int num1,int num2){
        return num1*num2;
    }

    public static int divide(int num1,int num2){
        return num1/num2;
    }
    /* Q1:
       - Implementation of add, subtract, multiply and divide methods in Calculator class




       - add(4,2) return 6
       - subtract(4,2) return 2
       - multiply(4,2) return 8
       - divide(4,2) return 2

     */
    public static void main(String[] args) {
        System.out.println(add(4,2));
        System.out.println(substract(5, 4));
        System.out.println(multiply(5, 4));
        System.out.println(divide(4, 88));
    }

}
