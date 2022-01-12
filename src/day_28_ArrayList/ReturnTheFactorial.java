package day_28_ArrayList;

public class ReturnTheFactorial {
    public static void main(String[] args) {


        int num=5;
        int factorial = num;

        for (int i = (num-1); i>1 ; i--) {
          factorial=  factorial*i;
        }
        System.out.println(factorial);
        /*Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
*/
    }
}
