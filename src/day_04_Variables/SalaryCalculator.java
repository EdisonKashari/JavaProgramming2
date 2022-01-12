package day_04_Variables;

public class SalaryCalculator {

    public static void main(String[] args){
        //hourlyrate, weeklyHours

        int hourlyRate =65;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours *numberOfWeeks;

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);


    }

}
