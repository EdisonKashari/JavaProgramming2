package day_04_01_08_2022;

public class EqualZerosAndOnes {
/*
Q3:
       - Given an array [1,1,1,0,1,0], after how many moves you need to make it equal the number of 0s and 1s
       - it should be given even length of Array
       Expected output:1
 */
public static void main(String[] args) {
    int [] arr= {1,1,1,0,1,0};
    int countzero=0;
    int countone=0;
    int moves = 0;
    for (int i : arr) {
        if (i==1){
            countone++;
        }else {
            countzero++;
        }
    }

    System.out.println("countone = " + countone);
    System.out.println("countzero = " + countzero);

    if (countone<countzero){
         moves =(countzero -countone)/2;
    }else {
        moves=(countone-countzero)/2;
    }
    System.out.println("moves = " + moves);



  /*  System.out.println("Math.abs(-2) = " + Math.abs(2));
    Math.abs((countzero-countone)/2)*/
}
}
