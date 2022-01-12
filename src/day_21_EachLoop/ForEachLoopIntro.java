package day_21_EachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int [] num = {1,4,5,7,5,8,7,10,41,47,41};


        for (int i = 0; i < num.length; i++) {
            int eachElement=num[i];
            System.out.println(eachElement);

        }

        for (int each : num) {
            System.out.print(each+" ");
        }
        System.out.println();
    }
}
