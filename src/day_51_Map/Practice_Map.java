package day_51_Map;

import java.util.HashMap;
import java.util.Map;

public class Practice_Map {
    public static void main(String[] args) {

        Map<String,Integer> student = new HashMap<>();
        student.put("Alan",50);
        student.put("Andy",65);
        student.put("Mike",72);
        student.put("Nicole",85);
        student.put("Anna",90);

        for (String eachKey : student.keySet()) {
            Integer eachKeyValue = student.get(eachKey);
            if (eachKeyValue< 80){
                System.out.println("eachKey = " + eachKey);
            }

        }


        Map<String,String> countries = new HashMap<>();
        countries.put("Albania","Tirana");
        countries.put("Italy","Roma");
        countries.put("France","Paris");
        countries.put("England","London");
        countries.put("Spain","Madrid");

        for (Map.Entry<String, String> each : countries.entrySet()) {
            System.out.println(each.getValue());
        }

    }
}
/*
 1. create a map that can contain student name and student' score
            put 5 of your friends names and their scores
            print out the names of the students who made less than 80


    2. create a map that can contain names of countries and their capitals
                use for each loop to print out all the capitals
 */