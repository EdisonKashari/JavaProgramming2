package Day_20_Arrays;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {

        //

        char [] alphabet = new char[26];/// Z~A
        char ch ='Z';

        for (int i = 0; i <alphabet.length ; i++,ch--) {
alphabet[i]=ch;
        }
//for(char i = 0,j='Z';i<alphabets.lengh;i++,j--0{
  //      alphabet[i]=j;
        System.out.println(Arrays.toString(alphabet));//print the whole array

    }
}
