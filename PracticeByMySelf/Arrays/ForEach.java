package Arrays;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] num ={1,5,7,5,7};

        Arrays.sort(num);// count number from less to greater

        System.out.println(Arrays.toString(num));
        System.out.println("min num is " +num[0]);//min always will be first after sort
        System.out.println("max num is " + num[num.length-1] );//max number alwas last number after we using sort
        System.out.println("----------------------------------------------------------------");

        String [] names = {"Edison","Mike","John","Smith"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------------------");


        int [] num1 = {1,2,3,4};
        int [] num2 = {4,3,2,1};


        Arrays.sort(num1);
        Arrays.sort(num2);

       boolean r1 = Arrays.equals(num1,num2);

        System.out.println(r1);


        char [] chi = {'a','c','b'};
        char [] cha = { 'b','c','a'};

        Arrays.sort(cha);
        Arrays.sort(chi);

        boolean ch =Arrays.equals(cha,chi);//Anagram check if to words has the same letters

        System.out.println(ch);







    }
}
