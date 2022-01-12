package day_17_While_DoWhile.day_21_ForEachLoop;

public class EvenNumber {
    public static void main(String[] args) {

        int[] number = {25,65,41,20,22,69,40,100};
int even = 0;
int odd = 0;
        for (int each : number) {
            if (each % 2 ==0){
                System.out.print(each + " ");
            }
        }
        System.out.println();
        for (int each : number) {
            if (each % 2 !=0){
                System.out.print(each+" ");
            }
        }
    }
}
// Write a program that can count the even and odd number from an array of integers
//
//			Note: MUST use for each loop