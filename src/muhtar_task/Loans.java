package muhtar_task;

public class Loans {

    public static void main(String[] args) {

        int salary = 30000;
        int score = 650;
       String loan= (salary >= 45000 && score >=550)? "Loan Approved" :(salary <= 40000 && score >= 540)? "Loan Denied" : "invalid number";

        System.out.println(loan);
        /*Create a class called Loans, Given two variables salary and credit score,
        use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY. */
    }
}
