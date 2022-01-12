package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUnique2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("java","c#","python","java"));

        for (String each : words) {
            int count = 0;

            for (String element : words) {
                if (element==each) {
                    count++;
                }
            }

            if (count==1){
                System.out.println(each);
                break;
            }

        }









    }
}
