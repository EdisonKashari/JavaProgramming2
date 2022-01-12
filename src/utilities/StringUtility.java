package utilities;

import java.util.Arrays;

public class StringUtility {


    //print each character of the given string
    public static void printEachChar(String str){
        for (int i = 0; i <str.length(); i++) {
            System.out.println(str.charAt(i));

        }


    }
// returns the given string and returns the reversed string
    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {//"Java
            result+=str.charAt(i);

        }
        return result;//"avaJ"
    }

    //check if the given string is palindrome
    public static boolean isPalindrome(String str){
      return   reverse(str).equalsIgnoreCase(str);

    }


    //checks if the given string is anagram

    public static boolean anagram(String str1,String str2){
        char[] ch1 =str1.toCharArray();
        char[]ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

      return   Arrays.equals(ch1,ch2);
    }


    //remove the duplicates from given string

    public static String removeDuplicates(String word){
String result="";
        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            if (!result.contains(""+each)) {

                result += each;
            }

        }
        return result;
    }
}