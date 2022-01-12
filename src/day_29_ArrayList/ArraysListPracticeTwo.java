package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListPracticeTwo {
    public static void main(String[] args) {
        ArrayList<String> employes = new ArrayList<>();
        employes.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron","David"));

        employes.retainAll(Arrays.asList("Ahmed","David"));

        System.out.println(employes);


        System.out.println("--------------------------------------------------------");
        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};


        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p->p.startsWith("M"));



      names=  list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

    }
}