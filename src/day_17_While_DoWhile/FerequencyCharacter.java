package day_17_While_DoWhile;

public class FerequencyCharacter {
    public static void main(String[] args) {
        String str ="AAABBBC";
        char ch ='A';

        int frequency = 0;//+1+1

        for (int i = 0; i < str.length(); i++) {// i:indexes of str
            char eachChar= str.charAt(i); //eachChar :each character of str
            if (ch == eachChar){
                frequency ++;
            }
        }
        System.out.println(frequency);// if given ch is matching with the eachChar,then ch is appeared in the String
    }
}


/* sentence ="JavaJavaJava";
output: 3



 */
