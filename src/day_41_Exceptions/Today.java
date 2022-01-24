package day_41_Exceptions;

public class Today {
    public static void main(String[] args) {




        try {
            System.out.println(10/0);

        }catch (RuntimeException e){

            e.printStackTrace();

            System.out.println("Today is Friday");

        }finally {
            System.exit(1);

            System.out.println("Turkey");
        }
        System.out.println("Tomorrow");



    }
}
