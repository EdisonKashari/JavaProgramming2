package day_28_ArrayList;

public class Finra {

    public static void main(String[] args) {  //i=1,2,3,...100

        for (int i =1;i<=100;i++){
            if (i % 15 == 0) { //15,30,45,
                System.out.print("Finra ");

            }else if (i % 3==0){
                System.out.print("Fin ");
            }else if (i % 5 == 0){
                System.out.print("Ra ");
            }else {
                System.out.print(i+" ");
            }
        }




        /* Write a method which prints out the numbers from 1 to 100 butfor numbers which are a multiple of both 3 and 5,
        print "FINRA" instead of the number,  for numbers which are a multiple of 3,
        print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN */
    }
}
