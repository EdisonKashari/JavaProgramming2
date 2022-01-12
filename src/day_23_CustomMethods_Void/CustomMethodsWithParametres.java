package day_23_CustomMethods_Void;

public class CustomMethodsWithParametres {
    public static void main(String[] args) {
      //  oddOrEven(); the method demainds additional info to complete its task
        oddOrEven(9);
        ageOfPerson(1990);
        printNumbers(5,100);
    }

    //create a function that can check if a number is odd number or even number

    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number + " is odd number");
        }

    }


    //create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){


        int age = 2021-birthYear;

        System.out.println("Your age is: " + age);

    }


    //numbers between x and y
    public static void printNumbers(int x,int y){
        for (int i = x; i <y ; i++) {
            System.out.print(i+" ");
        }
    }
}
