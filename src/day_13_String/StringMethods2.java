package day_13_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String character = "Edison";

        char first = character.charAt(0);
        char second = character.charAt(character.length()-1);

        if (first == second){
            System.out.println("same");
        }else{
            System.out.println("not the same");
        }

        //char first = sentence.charAt(0);
        //        char last = sentence.charAt(  sentence.length()-1  );

        /* write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same*/
    }
}
