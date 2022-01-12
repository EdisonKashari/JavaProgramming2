package SecondOfficeHour.practice_2_Array;

public class EvenNumber {

    public static void main(String[] args) {
         int number = 100;

        for (int i = 0; i <= number; i+=2) {

            System.out.print(i+" ");


        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 1; i <= number; i+=2) {
            System.out.print(i+" ");
        }
    }
}
