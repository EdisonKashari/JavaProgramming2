package day_16_ForLoopPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word = "AABCCD";

        String result ="";

        for (int i = 0; i < word.length() ; i++) {// index numbers starts from 0
            char ch =word.charAt(i);
            if (word.indexOf(ch)== word.lastIndexOf(ch)){//is the first and the last character is the same
                result+=ch;
        }



        }
        System.out.println(result);
        /*Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique*/

    }
}
