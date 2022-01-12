package muhtar_task;

public class OxygenTank {

    public static void main(String[] args) {

        int num = 101;
        String result = "";

        if (num >= 50 && num <=100){
            if (num >=50 && num <= 59){
                result = "Be carefull now you at 50%";
            }else if (num>=60 && num <=69){
                result = "Start to head back";
            }else  if (num >=70 && num <= 79){
                result = "Don't go to far";
            }else if (num>=80 && num <= 89){
                result = "Still okay";
            }else{
                result = "Your tank is full";
            }



        }else{
            result = "Invalid Number";
        }

        System.out.println(result);


        /* Create a class called OxygenTank. You are diving in the ocean.
        Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY  */
    }
}
