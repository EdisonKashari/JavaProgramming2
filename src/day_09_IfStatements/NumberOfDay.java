package day_09_IfStatements;

public class NumberOfDay {

    public static void main(String[] args) {

        int month = 5;
        String dayofmonth;
        if (month==2){
            dayofmonth ="28 Days";
            
        }else if (month==4 || month ==6 || month ==9 || month ==11){
            dayofmonth = "30 Days";
        }else{
            dayofmonth = "31 Days";
            
        }
        System.out.println("dayofmonth = " + dayofmonth);
    }
}
