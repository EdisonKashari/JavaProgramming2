package Arrays;

import java.util.Arrays;

public class RefactorArrayys3 {
    public static void main(String[] args) {

        char[] letters = new char[26];

     /*   for (char i = 'A',j=0; i <='Z'&& j< letters.length; i++,j++) { //i = increase the index and j increase the characters
letters[j]=i;
        }
*/
      /*  for (int i = 0,j='A'; i < letters.length; i++,j++) { // i increase index,j increase char
             letters[i]=(char) j;
        }*/
char ch = 'A';
        for (int i = 0; i < letters.length; i++,ch++) {

            letters[i]= ch;

        }

        System.out.println(Arrays.toString(letters));

        System.out.println("--------------------------------------------------------------------");


        char [] letters2 = new char[26];

      /*  for (int i = 0,j = 'Z'; i < letters2.length; i++,j--) {
letters2 [i]=(char) j;
        }*/

        char ch1 = 'Z';
        for (int i = 0,j=ch1; i < letters2.length; i++) {
            letters2[i]=ch1--;
        }
        System.out.println(Arrays.toString(letters2));
    }
}
