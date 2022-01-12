package day_04_01_08_2022;

import java.util.ArrayList;

public class FizzBuzzArrayList {

    public static void main(String[] args) {
        ArrayList<String> fizzBuzz=fizzBuzzGenerator(1,15);

        System.out.println(fizzBuzz);
    }

    private static boolean divisibleBy(int num1,int num2){
        return num1%num2==0;
    }

    private static ArrayList<String> fizzBuzzGenerator(int first,int end){
ArrayList<String> result = new ArrayList<>();
        for (int i = first; i <=end ; i++) {
           // if (i%3==0 && i%5==0){
            if (divisibleBy(i,15)){
                result.add("FizzBuzz");

            }else if (divisibleBy(i,3)){//(i%3==0)
                result.add("Fizz");
            }else if (divisibleBy(i,5)){//i%5==0
                result.add("Buuz");
            }else {
                result.add(i+"");
            }

        }
        return result;
    }

}
/*Q5:
       - Write a program that returns a list of strings between two numbers
       but
       for multiples of 3 insert "Fizz" instead of number
       for multiples of 5 insert "Buzz" instead of number
       for multiples of 3 and 5 insert "FizzBuzz" instead of number

       - You will also need to create a divisibleBy method that accepts two integer number and return a boolean.

       Input: fizzBuzzGenerator(1,15);
       Output: ["1","2","Fizz","4","Buzz",...,"FizzBuzz"]

 */