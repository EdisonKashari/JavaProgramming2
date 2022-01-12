package day_04_01_08_2022;

public class CreatingMethodsEasyWay {

    public static void main(String[] args) {

        int result1= add(4,4);
        int result2= substraction(4,2);
        int result3=divide(4,4);
        int result4= multiply(3,4);

    }

    private static int divide(int i, int i1) {
        return i/i1;
    }

    private static int substraction(int i, int i1) {
        return i-i1;
    }

    private static int add(int i, int i1) {
        return i+i1;
    }

    private static int multiply(int i,int j){
        return i*j;
    }



}
