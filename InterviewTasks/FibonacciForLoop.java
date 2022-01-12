import java.util.Arrays;
import java.util.Scanner;

public class FibonacciForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how Fibonacci number do you want");
        int number = input.nextInt();
      /*  int num1 = 0;
        int num2=1;
        int result =0;

        System.out.println(num1);
        System.out.println(num2);
        for (int i = 2; i < number; i++) {
            result=num1+num2;//0+1=1
            System.out.println(result);
            num1=num2;//num1=1
            num2=result;//num2=1

        }
*/

        // Fibonnacci with array

        int[] fibo=new int[number];

       fibo[0]=0;
       fibo[1]=1;

        for (int i =2; i < number; i++) {

            fibo[i]=fibo[i-1]+fibo[i-2];

        }
        System.out.println(Arrays.toString(fibo));












    }
}
