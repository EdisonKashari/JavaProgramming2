package SecondOfficeHour;

public class SwapTwoNumbersWithoutThirdVariable {
    public static void main(String[] args) {

        int a =5;
        int b = 10;
        a = a + b; //25
        b = a - b;//25-10=15
        a = a - b;//25-15=10

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
