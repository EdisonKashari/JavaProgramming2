package SecondOfficeHour.practice_2_Array;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        String [] element = {"java","python","java","c#"};

        for (int i = 0; i < element.length; i++) {
            int count =0;
            String result = element [i];

            for (int j = 0; j < element.length; j++) {

                if (element[j].equals(result)){
                    count++;
                }

            }
            if (count==1){
                System.out.println(result);
            }

        }

        System.out.println("--------------------------------------------------------------");

        String [] word = {"java","python","java"};

        for (String each : word) {
            int count = 0;

            for (String element1 : word) {

                if (element1.equals(each)){
                    count++;
                }

            }
            if (count==1){
                System.out.println(each);
            }


        }


    }
}
