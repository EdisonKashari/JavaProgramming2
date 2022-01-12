package Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char [] alphabet = new char[26];

        alphabet[0]='A';
        alphabet[1]='B';
        System.out.println(Arrays.toString(alphabet));//print the array
        System.out.println(alphabet[0]);//print the element

        System.out.println("----------------------------------------------");
char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++,ch--) {
            alphabet[i]= ch;
        }

        System.out.println(Arrays.toString(alphabet));

        String word[] =  {"java"};
        Arrays.spliterator(word);
        for (int i = word.length - 1; i >= 0; i--) {


        }
        System.out.println(Arrays.toString(word));
    }
}
