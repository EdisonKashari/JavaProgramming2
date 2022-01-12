package day_16_ForLoopPractice.day_19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aabccdeef";
        String result="";

        for (int j = 0; j <str.length() ; j++) {

            char ch =str.charAt(j);

        int count=0;// represents the frequency of the ch
        for (int i = 0; i <str.length() ; i++) {//compares the character that outer loop picked,with each characters
            char each=str.charAt(i);//each character of str
            if (ch==each){
             count++;
            }

        }
        if (count==1){//if the frequency of the character is 1,then the character is unique

        }
            result+=ch;

        }
        System.out.println(result);
    }
}
