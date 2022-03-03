package Donjeta_Tasks;

public class DivideTwoNumbers {
    public static void main(String[] args) {

     int result =   divideTwoNumbers(30,5);

     System.out.println(result);
    }

    public static int divideTwoNumbers(int a,int b){
        int count = 0;
        while (a>=b){
            a-=b;
            count++;
        }
        return count;
    }
}
