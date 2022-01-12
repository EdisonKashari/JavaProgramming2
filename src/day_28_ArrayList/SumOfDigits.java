package day_28_ArrayList;

public class SumOfDigits {
    public static void main(String[] args) {


        String digits = "Edison1990";

        String result ="";

        for (int i =digits.length(); i >=0 ; i++) {
         result+= digits.charAt(digits.length()-1);






        }
        System.out.print(result);
        /*Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1*/
    }
}
