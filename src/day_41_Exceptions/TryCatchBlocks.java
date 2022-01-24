package day_41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {
            System.out.println(9/0);
            System.out.println("Try Block");
        }catch (RuntimeException e){

            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception was ocurred");
        }

        System.out.println("Test1 Completed");


        System.out.println("---------------------------------------------------------");

        System.out.println("Test2 Started");

        int [] numbers={1,2,3,4,5};

        try {
            System.out.println(numbers[200]);
            System.out.println("Try block");
        }catch (RuntimeException e){
          //  e.getMessage();
            e.printStackTrace();
        }
        System.out.println("Test 2 completed");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Test 3 Started");

        try {
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Test 3 Completed");
    }


}
