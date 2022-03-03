package Donjeta_Tasks;

public class Prime_Number {


    public static void main(String[] args) {

     boolean numberisPrime =isPrime(6);

        System.out.println("numberisPrime = " + numberisPrime);
    }

    public static boolean isPrime(int number){

        if(number<2){
            return false;
        }

        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }
}
