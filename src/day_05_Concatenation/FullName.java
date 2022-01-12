package day_05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstname = "Edison";
        String lastname = "Kashari";
        int age = 31;
        String jobTitle = "SDET";
        String companyName = "Apple";
        String fullname = firstname + " " + lastname;

        System.out.println("Full name of the person is " + fullname +  ". ");

        // full name of the person is ____
        //__ is __ years old
        System.out.println(fullname + " is " + age + " years old.");

        //Full name is jobtitle,works at company name

        System.out.println(fullname + " is " + jobTitle + " works at " + companyName + ".");
    }
}
