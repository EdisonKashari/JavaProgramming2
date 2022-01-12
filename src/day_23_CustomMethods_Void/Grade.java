package day_23_CustomMethods_Void;

public class Grade {
    public static void main(String[] args) {
       gradeOfStudent(75);
    }
    public static void gradeOfStudent(int score){

        if(score>=100 && score<=90){
            System.out.println("Excellent");
        }else if(score>=89&& score<=80){
            System.out.println("Great Job");
        }else if (score>=79&& score<=70){
            System.out.println("Good Job");
        }else if (score>=69 && score<=60){
            System.out.println("Passed");
        }else if (score>=59 && score<=50){
            System.out.println("Failed");
        }else {
            System.out.println("Invalid");

        }

    }
     }

/*create a method that can calculate the grade of the student based on the score*/