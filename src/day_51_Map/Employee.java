package day_51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 140000);
        map.put("Jalil", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);
        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;

        String name2 = "";


        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();
            if (eachValue>maxSalary){
                maxSalary=eachValue;
                name1 =eachKey;

            }
            if (eachValue<minSalary){
                minSalary=eachValue;
                name2 = eachKey;
            }
        }
        System.out.println("Person with maximum salary + "+name1);
        System.out.println("Person with minimum salary = " + name2);


        int count = 0;
        for (Integer eachSalary : map.values()) {
            if (eachSalary >= 120000 && eachSalary <= 150000) {
                count++;
            }


        }
        System.out.println("count = " + count);
       // 1.4 display the names of the employees who are making less than 118k?
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue()< 118000){
                System.out.println(pair.getKey());
            }
        }
        // 1.5 increase the salary of each employee by 10K if the current salary of each employee is less than 120k

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()<120000){
                entry.setValue(entry.getValue()+ 10000);


            }
        }
        System.out.println(map);


/*
        for (Integer eachsalary : map.values()) {
            if (eachsalary > maxSalary) {
                maxSalary = eachsalary;

            }
            if (eachsalary < minSalary) {
                minSalary = eachsalary;
            }

        }

        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);

        int count = 0;
        for (Integer eachSalary : map.values()) {
            if (eachSalary >= 120000 && eachSalary <= 150000) {
                count++;
            }


        }
        System.out.println("count = " + count);
        Map<String, Integer> namesLessThan118 = new LinkedHashMap<>();

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if (value > 118000) {
                namesLessThan118.put(key, value);

            }

        }
        System.out.println("namesLessThan118 = " + namesLessThan118);



 */

       /* 1. Given the following map that contains the employee name and thier salary:
        1.1 who has the maximum salary?
                1.2 who has the minimum salary?
                1.3 how many employees has the salary between 120k ~ 150K?
                1.4 display the names of the employees who are making less than 118k?
                1.5 increase the salary of each employee by 10K


        */
    }
}
