package day_21_EachLoop;

import java.util.Arrays;

public class DonjetasTasks {
    public static void main(String[] args) {

        String word = "231CBA546FDE897";

        char chars [] = word.toCharArray();

        String letters = "";
       String digits = "";

        Arrays.sort(chars);
        for (char each : chars) {
            if (Character.isLetter(each)){
               letters+=each;
            }else {
                digits+=each;
            }

        }





        String result = digits.substring(0,3)+ letters.substring(0,3)+digits.substring(3,6)+letters.substring(3)+digits.substring(6);

        System.out.println("result = " + result);

    }
}
//Given alphanumeric String we need to split the string into substrings of consecutive letters or numbers,
// sort the induvidual string and append them back together
// Inut:  231    CBA    546   FDE   897
// Output:  123ABC456DEF789