package SecondOfficeHour;

public class TwoDigitsNestedLoop {
    public static void main(String[] args) {
        for (int a = 1; a <=9 ; a++) {
            for (int b = 0; b <=9 ; b++) {
               int ab = 10*a+b;
                System.out.print(ab+" ");
            }
        }

    }
}
