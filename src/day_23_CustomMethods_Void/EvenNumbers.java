package day_23_CustomMethods_Void;

public class EvenNumbers {

    public static void main(String[] args) {
        evenNumbers1To100(1,100);
    }

    public static void evenNumbers1To100(int x,int y){

        for (int i = x; i <= y; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }


        }
    }
}
