package day_23_CustomMethods_Void;

public class CustomMethodsIntro {


    public static void main(String[] args) {
        System.out.println("Test Starded");
        greeting(31);

        greeting();
        System.out.println("Test Completed");

    }

   public static void greeting(){

       System.out.println("Hello Cydeo");
       System.out.println("How are you?");
      // callMethod();
   }
public static void greeting(int age){
    System.out.println("My age is "+ age);
}

}
