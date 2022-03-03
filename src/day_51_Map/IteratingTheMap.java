package day_51_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingTheMap {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();

        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

       Set<String > keys = students.keySet();
/*
        for (String eachKeys : keys) {
          //  System.out.println(eachKeys + " : " + students.get(eachKeys));
            students.replace(eachKeys, students.get(eachKeys) + 5);
        }

 */

        //remove all the students who score is less than 90
/*
        for (String eachKey : students.keySet()) {
            Integer eachValue =students.get(eachKey);
            if (eachValue < 90){
                System.out.println(eachKey);
            }

        }

 */




    }
}
