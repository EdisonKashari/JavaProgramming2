package day_30_CustomClass;

import java.util.ArrayList;

public class RemoveDuplicate {

   public static void main(String[] args) {
      /*  String str ="aaabbdlldfffddd";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char cha = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (cha==ch){
                 count++;
                }
            }
if (count==1){
    System.out.println(cha);

}

        }

   */

       ArrayList<Character> list = new ArrayList<>();
       for (char i = 'z'; i >='a' ; i--) {
           list.add(i);
       }
       System.out.println(list);


   }
}
