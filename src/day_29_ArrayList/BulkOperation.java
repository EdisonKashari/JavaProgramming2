package day_29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(3,5,8));//remove all the matching elements from the arraylist

        System.out.println("list = " + list);
        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900));
        System.out.println("number = " + number);
        number.retainAll(Arrays.asList(100,200,300));

        System.out.println("number = " + number);

        System.out.println("---------------------------------------------------------------------");

        ArrayList<String>jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","DEVELOPER","QA","SDET","Scrum Master","BA","BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(jobTitles);

        System.out.println("-------------------------------------------------------------------------");

        ArrayList<Integer> nums =new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));


        System.out.println("r3 = " + r3);

        System.out.println("------------------------------------------------------------");

        String [] names = {"Josh","Jack","Daniel","Shay","Breana"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
       /* nameList.addAll(Arrays.asList(names));
     */
        System.out.println(nameList);


        System.out.println("-------------------------------------------------------------------------");

        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);

    }


    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;




    }
}
