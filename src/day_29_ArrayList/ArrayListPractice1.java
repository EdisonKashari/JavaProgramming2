package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        String []countries =  {"Italy","Korea","Usa","Turkey","United Kingdom","Canada"};
        // converting array to arraylist
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p->p.length()>=10);

        //converting arraylist to array
        countries=   list.toArray(new String[6]);

        System.out.println(Arrays.toString(countries));
    }
}
