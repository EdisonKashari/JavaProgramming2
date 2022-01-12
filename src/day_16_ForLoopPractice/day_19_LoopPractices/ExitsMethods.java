package day_16_ForLoopPractice.day_19_LoopPractices;

public class ExitsMethods {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {


            if (i==3){
               // break;//terminates the loop
               // continue;////skip number 3
                System.exit(0);// terminates the program
            }
            System.out.println(i);
        }

        System.out.println("Wooden Spoon");
    }
}
