import java.util.Scanner;

public class FactorialWithForLoop {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int number =input.nextInt();
int result = 1;
        for (int i = number; i >=1 ; i--) {
            result*=number;
        }
        System.out.println(result);
    }
}
