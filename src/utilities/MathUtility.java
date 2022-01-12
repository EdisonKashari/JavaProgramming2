package utilities;

public class MathUtility {




    //return the sum of two integers
    public static int  sumOfTwoNumbers(int num1,int num2){

        int result = num1+num2;
        return result;
    }
    //return the sum of two dicemals
    public static double  sumOfTwoNumbers(double num1,double num2){

        double result = num1+num2;
        return result;
    }

    //return the subtraction of two integers
    public static int subtractionOfTwoNumbers(int num1,int num2){

        int result = num1-num2;
        return result;
    }
    //return the subtraction of two decimals
    public static double subtractionOfTwoNumbers(double num1,double num2){

        double result = num1-num2;
        return result;
    }

    //return the multiplication of two integers
    public static int multiplicationOfTwoNumbers( int num1,int num2){
        int result = num1*num2;
        return result;

    }
    //return the multiplication of two decimals
    public static double multiplicationOfTwoNumbers( double num1,double num2){
        double result = num1*num2;
        return result;

    }

     // divide two integer numbers
    public static int divideTwoNumbers ( int num1,int num2){

        int result = num1/num2;
        return result;
    }
    // divide two decimal numbers
    public static double divideTwoNumbers ( double num1,double num2){

        double result = num1/num2;
        return result;
    }
     // return even number
    public static boolean evenNumber(int num){
      boolean result = false;

        if (num%2==0){
            result=true;
        }
        return result;
    }
    // return odd number
    public static boolean oddNumber(int num){
        boolean result = false;

        if (num%2!=0){
            result=true;
        }
        return result;
    }


    //return the maximum number between two integers
    public static int maxNumber(int num1,int num2){
        int result = 0;
        if (num1>num2){
            result=num1;
        }else {
            result =num2;
        }
        return result;
    }
    //return the maximum number between two decimals
    public static double maxNumber(double num1,double num2){
        double result = 0;
        if (num1>num2){
            result=num1;
        }else {
            result =num2;
        }
        return result;
    }

     //return the minimum number between two decimals
    public static double minNumber(double num1,double num2){
        double result = 0;
        if (num1<num2){
            result=num1;
        }else {
            result =num2;
        }
        return result;
    }
     //return the minimum number between two integers
    public static int minNumber(int num1,int num2){
       int result = 0;
        if (num1<num2){
            result=num1;
        }else {
            result =num2;
        }
        return result;
    }

    //return the square of an integer
    public static int squareOfNumber(int num){
        int result = num*num;
        return result;
    }
    //return the square of an decimal
    public static double squareOfNumber(double num){
        double result = num*num;
        return result;
    }

    //return the cube of an integer
    public static int cubeOfNumber(int num){
        int result = num*num*num;
        return result;
    }
    //return the cube of an decimal
    public static double cubeOfNumber(double num){
        double result = num*num*num;
        return result;
    }



































}
