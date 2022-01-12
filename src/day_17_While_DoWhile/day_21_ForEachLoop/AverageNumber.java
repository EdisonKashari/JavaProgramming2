package day_17_While_DoWhile.day_21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int [] numbers= {1,8,45,14,65};
      double sum=0;

        for (int number : numbers) {
            sum+=number;
        }

        double average = sum/numbers.length;

        System.out.println(average);

    }
}
