package day_10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {
        int score = 101;
        /* 90 ~ 100: excellent
           80 ~ 89   great
           70 ~ 79 good
           60 ~ 69 passed
           0 ~ 59 failed
         */

        if (score >= 0 && score <= 100) { // if the score is valid

            // 5 possibilities: A,B,C,D,F

            if (score>= 90 ){ // false: score < 90
                System.out.println("Excellent");
            }else if (score >= 80 ){ //
                System.out.println("Great");
            }else if (score >= 70 ){
                System.out.println("Good");
            }else if (score >= 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }


        } else {
            System.out.println("Invalid Number");
        }


        System.out.println("---------------------------------");
              String result ="";
        if (score >= 0 && score <= 100) { // if the score is valid

            // 5 possibilities: A,B,C,D,F

            if (score>= 90 ){ // false: score < 90
               result = "Excellent";
            }else if (score >= 80 ){ //
                result = "Great";
            }else if (score >= 70 ){
                result = "Good";
            }else if (score >= 60){
                result ="Passed";
            }else{
                result = "Failed";
            }


        } else {
            result = "Invalid Number";
        }

        System.out.println(result);
    }
}