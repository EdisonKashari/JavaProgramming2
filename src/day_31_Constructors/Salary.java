package day_31_Constructors;

public class Salary {
    public int weeklyHours,hourlyRate;
    public double stateTaxRate, federalTaxRate;

    public Salary(int weeklyHours, int hourlyRate, double stateTaxRate, double federalTaxRate) {
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double  salary(){
        return ( hourlyRate * weeklyHours * 52);
    }
    public double stateTax(){
        return    stateTaxRate  * salary() / 100;
    }

    public double federalTax(){

        return federalTaxRate * salary() / 100;
    }
    public double salaryAfterTax(){
        return salary()- (stateTax()+federalTax()) ;
    }

    public String toString() {
        return "Salary{" +
                "weeklyHours=" + weeklyHours +
                ", hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary= $" + salary() +
                ", stateTax= $" + stateTax() +
                ", federalTax= $" + federalTax() +
                ", salaryAfterTax= $" + salaryAfterTax() +
                '}';
    }
}

/* SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): claculates the totalstateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
*/
