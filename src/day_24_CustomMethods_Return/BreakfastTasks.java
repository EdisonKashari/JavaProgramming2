package day_24_CustomMethods_Return;

import java.util.Locale;

public class BreakfastTasks {
    public static void main(String[] args) {
initials("hello","world");
        System.out.println("-----------------------------------");
domain("edisonkashari@hotmail.com");
        System.out.println("--------------------------------------");

        String[] emails = {"josh@gmail.com","Jim@yahoo.com",};
        for (String email : emails) {
            domain(email);
            System.out.println("----------------------------------");
            nameOfMonth(5);

            System.out.println("-----------------------------------");
            nameOfTheDay(5);
            System.out.println("-------------------------------------");
            ageGroups(77);
            System.out.println("---------------------------------------");
            uniqueChar("AVDDEEBDSS");
        }
    }
    //1. Create a method that can display the initials of the person,
    public static void initials(String firstName,String lastName){
        String result= firstName.charAt(0)+"."+lastName.charAt(0);
        result = result.toUpperCase();
        System.out.println("initial = "+result);
    }

    //2. Create a method that can display the domain of the email.domain(String email)

public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1 , email.lastIndexOf("."));
    System.out.println("domain = "+domain);
}

//3Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number){
        String name="";

        if (number>=1 && number<=12){

            name=(number==1)?"Jan" :(number==2)? "Feb" :(number==3)?"Mar" :(number==4)? "Apr" :(number==5)?"May":(number==6)?"Jun"
                    :(number==7)?"July" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct" :(number==11)?"Nov" :"Dec";



        }else {

            name="invalid";

        }
        System.out.println("Month name = " + name);
    }
    //Create a method that can print the name of the day based on the given number to the method

    public static void nameOfTheDay(int number){
        String result ="";
        if(number>=1 && number <=7){

         result=   (number==1)?"Monday" :(number==2)?"Tuesday" :(number==3)?"Wednesday" :(number==4)?"Thursday"
                    :(number==5)?"Friday" :(number==6)? "Saturady" :"Sunday";


        }else {
            result ="invalid number";
        }
        System.out.println("Today is = " + result);
    }
// Age groups age groups are:
//                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
//                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
//                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
//                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
//                        Senior Citizen (75 - 84),
//                        Old Senior Citizen (85+) (edited)
//
//4
    public static void ageGroups(int number){
        String result = "";
        if(number>=1 && number<=2){
            result="Infant";
        }else if (number <=3 || number<=5){
            result="Toddler";
        }else if (number <=6 || number<=9){
            result="Kid";
        }else if (number<= 10 || number<=12){
            result="Pre-Teen";
        }else if (number<= 13 || number<=17){
            result="Teenager";
        }else if (number<=18 || number <= 20){
            result="Young Adult";
        }else if (number<=21 || number <= 39){
            result="Adult";
        }else if (number <= 40 || number<=49){
            result="Young Middle-Aged Adult";
        }else if (number <= 50 || number<= 59){
            result ="Middle-Aged Adult";
        }else if (number <= 60 || number<=74){
            result="Young Senior Citizen";
        }else if (number <=75 || number<=84){
            result ="Senior Citizen";
        }else if (number==85){
            result = "  Old Senior Citizen";
        }else {
            result ="invalid number";
        }
        System.out.println(result);
    }

    // create a method that can display the unique characters of a string

    public static void uniqueChar(String word){
        String result="";

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            if (word.indexOf(ch)==word.lastIndexOf(ch)){
                result+=ch;
            }

        }
        System.out.println("Unique char are = "+result);


    }


    //create a method that can display the unique elements of an integer array

public static void uniqueElementsOfArray(int [] number){

    for (int elements : number) {
      int count = 0;

    }
}

}


/**
 * 1. Create a method that can display the initials of the person
 *
 * 	2. Create a method that can display the domain of the email
 *
 * 	3. Create a method that can display the name of the month based on the given number to the method
 *
 * 	4. Create a method that can print the name of the day based on the given number to the method
 *
 * 	5. Create a method that can print how many days a month has
 */