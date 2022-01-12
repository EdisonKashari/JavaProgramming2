package day_25_CustomMethods_OverLoading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {
        String str = "Java Programming Language";

        StringUtility.printEachChar(str);
        System.out.println("------------------------------");

        String s1 = "Wooden Spoon";

      String reverse=  StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("-----------------------------------------------------------");

        String word = "Civic";

       boolean result= StringUtility.isPalindrome(word);
        System.out.println(result);

        System.out.println("--------------------------------------------------------------");

        String [] names = {"Anna","Java","Python"};
        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each));{
                count++;
            }

        }
        System.out.println(count);

        System.out.println("------------------------------------------------------------------------");

        String word1 = "aaaaaaaaabbbbbcddddd";

String result1 = StringUtility.removeDuplicates(word1);
        System.out.println(result1);
    }

}
