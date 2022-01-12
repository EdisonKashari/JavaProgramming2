package muhtar_task;

public class Grade {

    public static void main(String[] args) {
        char grade = 'D';
        String name = "";
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'|| grade =='F'){
            if (grade == 'A'){
                name ="excellent";
            }else if (grade == 'B'){
                name ="great job";
            }else if (grade == 'C'){
                name = "good";
            }else if (grade == 'D'){
                name = "passed";
            }else{
                name = "failed";
            }


        }else{
            name = "invalid";
        }
        System.out.println(name);
        /*         Create a class called Grade, a char variable named grade is given.
         write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT */
    }
}
