package ForEach;

import java.util.Arrays;

public class DonjetasTasks {
    public static void main(String[] args) {
        String word = "231CBA546FDE897";

        char chars[] = word.toCharArray();

        String letters = "";
        String digits = "";

        Arrays.sort(chars);
        for (char each : chars) {
            if (Character.isLetter(each)) {
                letters += each;

            } else {
                digits += each;
            }

        }

        String result = "";
        int count = 0;
        int z = 0;
        int j = 0;

        while (count < word.length()) {

            for (int i = 0; i < 3; i++)
                if (z < digits.length())
                    result += digits.charAt(z++);

            for (int i = 0; i < 3; i++)
                if (j < letters.length())
                    result += letters.charAt(j++);
            count++;
        }

        System.out.println(result);

    }
}
//Given alphanumeric String we need to split the string into substrings of consecutive letters or numbers,
// sort the induvidual string and append them back together
// Inut:  231    CBA    546   FDE   897
// Output:  123ABC456DEF789