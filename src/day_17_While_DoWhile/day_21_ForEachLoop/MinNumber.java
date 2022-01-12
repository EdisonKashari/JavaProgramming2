package day_17_While_DoWhile.day_21_ForEachLoop;

public class MinNumber {

    public static void main(String[] args) {
        int [] number= {1,8,45,14,65};
        int min= number[0];
        for (int i : number) {
            if (i<min){
                min+=i;

            }

        }
        System.out.println(min);
    }
}
