package day_27_WrapperClasses;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        String password = "Cydeo1990$";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;// has upper case
        boolean r3 = false;// has lower case
        boolean r4 = false;// has special characters
        boolean r5 = false;// has a digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {//special char
                r4 = true;
            }
            /*
            if (r2 && r3 && r4 && r5){//
                break;
            }
            */
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("Is strong password = " + isStrongPassword);


    }
}






      /*  Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Password: ");
        String password = input.nextLine();
        //  String password = "Edison1?";

        if (password.length() <= 8 && !password.contains(" ")) {
            System.out.println("Invalid Password");
            System.exit(0);



        }
        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each) && Character.isLowerCase(each) && Character.isDigit(each)
                    && !Character.isDigit(each)) {

            }

        }
        System.out.println("Password is Strong");*/




/*PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit*/