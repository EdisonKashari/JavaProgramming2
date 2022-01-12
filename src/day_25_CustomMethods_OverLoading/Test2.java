package day_25_CustomMethods_OverLoading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5,6};
        ArraysUtility.printEachElement(arr1);
        System.out.println("--------------------------");

        double [] arr2 = {1.5,2.4,5.5,1.4};
        ArraysUtility.printEachElement(arr2);

        System.out.println("----------------------------");

        char [] ch = {'a','c','d'};
        ArraysUtility.printEachElement(ch);

        System.out.println("---------------------------");

        String [] word = {"alan","edi"};
        ArraysUtility.printEachElement(word);

        int [] num = {1,5,7,8};
        int max1 = ArraysUtility.max(num);
        System.out.println(max1);
        System.out.println("------------------");

        double [] num2 ={2.2,2.5,6.8,8.7};
        double result = ArraysUtility.max(num2);
        System.out.println(result);

    }
}
