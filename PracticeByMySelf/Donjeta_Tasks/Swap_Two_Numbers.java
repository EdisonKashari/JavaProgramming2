package Donjeta_Tasks;

public class Swap_Two_Numbers {

    public static void swaupTwoNumbers(int a,int b){

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swaping : a= "+a + " b= "+ b);

    }

    public static void main(String[] args) {

      swaupTwoNumbers(20,10);

    }

}
