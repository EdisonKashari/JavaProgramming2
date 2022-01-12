package day_16_ForLoopPractice;

public class FrequencyJava {
    public static void main(String[] args) {
        String sentence = "Java Java Java ";
        int frequnce = 0;

        for (int i = 0; i < sentence.length()-1; i++) {
            if (sentence.contains("Java")){
                sentence=sentence.replaceFirst("Java","");
                frequnce ++;
            }

        }
        System.out.println("frequnce = " + frequnce);
        /* write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2*/
    }
}
