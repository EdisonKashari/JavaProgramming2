package day_23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5times();
        evenNumber();

    }


    //create a funcion that can print hello world 5 times==>helloWorld5times
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }

    }



    //create a funcion that can print hello Cydeo 5 times==>helloCydeo5times

    public static void helloCydeo5times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }
    }


    //create a function that can create all the even numbers from 1~10==>evenNumber
    public static void evenNumber(){

        for (int i = 2;i<11;i+=2){
            System.out.println(i);
        }
    }
}
