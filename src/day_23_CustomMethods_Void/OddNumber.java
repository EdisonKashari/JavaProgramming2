package day_23_CustomMethods_Void;

public class OddNumber {
    public static void main(String[] args) {
        oddNumber(1,100);
    }

    public static void oddNumber (int x,int y){
        for (int i = x; i <= y; i++) {
            if (i%2!=0){
                System.out.print(i + " ");
            }

        }
    }
}
