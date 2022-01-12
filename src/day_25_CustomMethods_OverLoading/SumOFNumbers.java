package day_25_CustomMethods_OverLoading;

public class SumOFNumbers {
    public static void main(String[] args) {
      int sum=  sumOfTwoNumbers(45,25);
        System.out.println(sum);
        int sum1 = sumOfThreeNumbers(25,14,54);
        System.out.println(sum1);
        int sum2= sumOf4Numbers(14,25,45,47);
        System.out.println(sum2);

    }
    public static int sumOfTwoNumbers(int num1,int num ){
        return num+num1;

    }

    public static int sumOfThreeNumbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static int sumOf4Numbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
}
/* 1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers*/