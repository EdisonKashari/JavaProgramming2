package day_23_CustomMethods_Void;

import java.util.Arrays;

public class DollarToLira {
    public static void main(String[] args) {
dollarToLira(5);
kgToLb(5);
positiveNegative(5);
eachChar("Edison");
calculator(5,10,'+');
anagram("listen","silent");
fullName("cYdEo","SCHOOL");
printEachChar();
printEachNumber(new int[]{10,25,65});
    }
    /* create a method that can can convert dollar to lira*/
    public static void dollarToLira(int dollar){
        double convert = dollar * 13.78;
        System.out.println(convert);

    }

    //create a method that can convert kg to lb
    public static void kgToLb(int kg){
        System.out.println("-------------------------------------------");
        double convert = kg *2.20;
        System.out.println(convert);
    }

    //create a method that can if the given integer is positive, negative or zero
public static void positiveNegative(int number){
    System.out.println("---------------------------------------------------");
        if (number>0){
            System.out.println(number+" is positive ");
        }else if (number<0){
            System.out.println(number+"  is negative: ");
        }else {
            System.out.println(number+" is zero");
        }
}


   // create a method named printEachChar that can print each characters of a string
    public static void eachChar(String word){

    }


    //create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
    public static void calculator(int num1,int num2,char operator){
        if (operator == '+') {
            System.out.println(num1+num2);
        } else if (operator == '-') {
            System.out.println(num1-num2);

        }else if (operator == '*'){
            System.out.println(num1*num2);
        }else if (operator == '/'){
            System.out.println(num1/num2);
        }else {
            System.out.println("invalid operator");
        }
    }

    //create a method that can check if two strings are anagram
    //    		ex:
    //    			anagram("silent", "listen")
    //
    //
    //			output:
    //				silent and listen are anagram
    public static void anagram(String str1,String str2){
        char []ch1 = str1.toCharArray();
        char []ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            System.out.println(str1+ " and " + str2 + " are anagram");
        }else {
            System.out.println(str1+ " and " + str2 + " are not anagram");
        }

    }

//write a method that can print out the full name of a person in regular format
//            ex:
//               fullName("cYdEo", "SCHOOL");
//
//                output:
//                    "Cydeo School"

    public static void fullName(String word1,String word2){


        String result1=  word1.substring(0,1).toUpperCase()+word1.substring(1).toLowerCase();
        String result2 = word2.substring(0,1).toUpperCase()+word2.substring(1).toLowerCase();
        System.out.println(result1+" "+result2);
    }


    //create a method named printEachChar that can print each characters of a string

    public static void printEachChar(){
        String sentence= "I love Java";
        for (int i = 0; i <sentence.length() ; i++) {
            System.out.print(sentence.charAt(i)+" ");

        }
    }

    //create a method named printEachElement that can print each elements of an integer array
public static void printEachNumber(int[]number){

    for (int element : number) {
        System.out.println(element);
    }

    }
}
