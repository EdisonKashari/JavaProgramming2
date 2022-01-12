package day_17_While_DoWhile.day_21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int [] number= {1,8,45,14,65};
        int max= number[0];

        for (int i : number) {
            if (i>max){
                max=i;

            }

        }
        System.out.println(max);
    }
}
