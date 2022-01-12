package day_13_String;



import java.util.Scanner;

public class Initial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String name = input.nextLine();

        System.out.println("Enter last name");
        String last = input.nextLine();

        String result= name.toUpperCase().charAt(0) + "."+ last.toUpperCase().charAt(0);

        System.out.println(result);








        /*write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
*/



    }
}
