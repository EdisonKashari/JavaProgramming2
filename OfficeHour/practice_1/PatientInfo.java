package practice_1;

public class PatientInfo {
    public static void main(String[] args) {


    /*                   1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)

@Huseyin Turgut
Day01 class name?
*/
    String name="John";
    int age=38;
    char gender='M';
    String dateOfBirth="12/01/1983";
    boolean isMarried= true;
    String phoneNumber="(123)456-7890";
    boolean havingInsurance=true;
    String insurancenumber="A123456789";
    String employer="Cydeo";
    double copayWithInsurance=20.00;
    double copayWithoutInsurance=250.00;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("insurancenumber = " + insurancenumber);
        System.out.println("employer = " + employer);
        System.out.println("copayWithInsurance = " + copayWithInsurance);
        System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);


        System.out.println("--------------------Escape Sequences-------------------------");
        System.out.println("\tname: "+name+"\n\tage: "+age+"\n\tgender: "+gender );

        if (havingInsurance){
            System.out.println("copayWithInsurance = " + copayWithInsurance);
        }else {
            System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);
        }
}
}