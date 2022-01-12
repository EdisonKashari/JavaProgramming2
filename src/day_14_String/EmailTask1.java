package day_14_String;

public class EmailTask1 {

    public static void main(String[] args) {


        String name = "mike";
        String lastname = "tyson";

        String domain = "@gmail.com";
        String email = name+ "_" + lastname + domain;

        String replace1 = name.replaceFirst(name,lastname);
        String replace2 = lastname.replaceFirst(lastname,name);


        System.out.println(email);
        System.out.println(replace1+ "_" + replace2 + domain);




        /*Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com*/
    }
}
