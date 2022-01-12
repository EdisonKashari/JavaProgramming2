package day_11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "I";

        switch (browserName){
            case "A":
                System.out.println("The browser is Chrome");
                break;
            case "B":
                System.out.println("The browser is Firefox");
                break;
            case "C":
                System.out.println("The browser is Opera");
                break;
            case "D":
                System.out.println("The browser is Safari");
                break;
            case "E":
                System.out.println("The browser is Edge");
            default:
                System.out.println("Invalid Browser");
        }


        /*  write a program that can display the selected browser
            3.1  declear a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary*/
    }
}
