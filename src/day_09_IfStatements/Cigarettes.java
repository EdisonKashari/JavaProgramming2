package day_09_IfStatements;

public class Cigarettes {
    public static void main(String[] args) {
        byte age = 15;

        boolean a = age >= 10 && age <= 20;
        boolean b = age >= 20 && age <= 30;
        boolean c = age >= 30 && age <= 40;
        boolean d = age >=40 && age <= 50;

        if (a){
            System.out.println("Not Eligible to buy Cigarettes ");
        }
        if (b){
            System.out.println("Eligible to buy Cigarettes");
        }
        if (c){
            System.out.println("Eligible to buy Cigarettes");
        }
        if (d){
            System.out.println("Eligible to buy Cigarettes");
        }
        /*Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes */
    }
}
