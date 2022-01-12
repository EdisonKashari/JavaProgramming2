package day_19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str ="aabcccd";
        String result="";//a2b1c3d1

        for (int j = 0; j <str.length() ; j++) {

            char ch=str.charAt(j); //each character from String
        int count=0;

        for (int i = 0; i <str.length() ; i++) {//to find the frequency
            char each = str.charAt(i);
            if (each==ch){
                count++;
            }
        }
        if (result.contains(""+ch)){
            continue;
        }
        result+=ch;
        result+=count;
        }
        System.out.println(result);
    }
}
/* Write a program that can find the frequency of the characters from a string
        Ex:
        str = "aabcccd";
        output:
        a2b1c3d1  */