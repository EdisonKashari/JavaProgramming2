package day_25_CustomMethods_OverLoading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {


        int[] numArray = {5, 4, 7, 5};
        Arrays.sort(numArray);

        double[] doubleArray = {4.5, 4.7, 5.5};
        Arrays.sort(doubleArray);


        char[] charArray = {'A', 'B', 'C', 'D'};
        Arrays.sort(charArray);


        System.out.println("--------------------------------------------------------------");

        //sum of 10 and 20
      int sum1=  sumOfNumbers(5,4);

        System.out.println(sum1);

        int sum2 =sumOfNumbers(5,7,8);
        System.out.println(sum2);

        double sum3 = sumOfNumbers(4.4,3.5);
        System.out.println(sum3);





    }
        public static int sumOfNumbers(int num1,int num ){
            return num+num1;

        }

        public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
        }

        public static int sumOfNumbers(int num1,int num2,int num3){
            return num1+num2+num3;


        }
        public static double sumOfNumbers(double num1,double num2,double num3){
        return sumOfNumbers(num1,num2)+num3;
        }
        public static int sumOfNumbers(int num1,int num2,int num3,int num4){
            return num1+num2+num3+num4;
        }

}
