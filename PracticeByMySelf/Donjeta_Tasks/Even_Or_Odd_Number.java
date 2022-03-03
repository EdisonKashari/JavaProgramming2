package Donjeta_Tasks;

public class Even_Or_Odd_Number {

    public static void even_oddNumber(int num){

        if (num%2==0){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }
    }



    public static void main(String[] args) {
       even_oddNumber(5);
       even_oddNumber(6);




    }
}
