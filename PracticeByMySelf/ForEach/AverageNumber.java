package ForEach;

public class AverageNumber {
    public static void main(String[] args) {
        int [] num = {45,47,14,54,78,1,4,7};
        int sum=0;

        for (int each : num) {
            sum+=each;


        }
        double average = sum/num.length;
        System.out.println(average);



    }
}
