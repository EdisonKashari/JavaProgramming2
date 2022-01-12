package Day_20_Arrays;

import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {


       String[] classmates={"Steve Nash","Lebron James","Anthony Davis ","Klay Thompson","Stephen Curry","Lionel Messi"};

        for (int i = 0; i < classmates.length; i++) {
            String reversed = "";
            String name = classmates[i];
            for (int j = name.length()-1; j >=0 ; j--) {
                reversed += name.charAt(j);

            }

            System.out.println(reversed);


        }





      //  for (int i = 0; i < classmates.length; i++) {

       //     System.out.println(classmates[i].charAt(0) + " ");
//  String word = "Wooden Spoon";
//
//        for (int i = word.length()-1; i >=0; i--) {
//            System.out.print(word.charAt(i));
            








        /* create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines*/
    }
}
