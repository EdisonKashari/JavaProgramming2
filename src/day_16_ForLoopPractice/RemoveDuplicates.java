package day_16_ForLoopPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String word = "AABBCCBC";

        String result="";

        for (int i = 0; i <= word.length()-1; i++) {// represents the all the index numbers of word (starts from 0)
           String ch =""+ word.charAt(i);// represents each Character of word
            if (!result.contains(ch)){// if the character is not contained in the result

                result+=ch;// the result will be added to the result
            }

        }
        System.out.print(result);
       /* for (int i = word.length()-1; i >= 0; i--) {

            if (result.contains(""+word.charAt(i))){
                result+=word.charAt(i);
            }
            System.out.println(result);

        }
        /* Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding*/
    }
}
