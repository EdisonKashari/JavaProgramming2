package day_14_String;

import java.util.Locale;

public class EmailTask2 {
    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        String first = email.substring(0,5);
        String second = email.substring(6,15);
        String third = email.substring(16,21);



        System.out.println("First name: "+ first.substring(0,1).toUpperCase()+first.substring(1));

        System.out.println(("Last name: "+ second.substring(0,1).toUpperCase()+second.substring(1)));
        System.out.println("Domain: " + third);




        /*Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple*/
    }
}
