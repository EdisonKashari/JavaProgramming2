package day_17_While_DoWhile.day_21_ForEachLoop;
import java.util.Arrays;
public class Palindromes {
    public static void main(String[] args) {
        String[] str = {"anna", "level", "Java"};
        int count = 0;
        String result = "Palindrome words are: ";

        for (String each1 : str) {
            String reverse = "";
            for (int i = each1.length() - 1; i >= 0; i--) { // reverses the string
                reverse += each1.charAt(i);
            }
            if (each1.equals(reverse)) {
                result += each1+", ";
                count++;
            }
        }
        System.out.println(Arrays.toString(str));
        System.out.println(result.substring(0, result.length()-2)+".");
        System.out.println("Total count of palindromes: "+count);
    }
}
