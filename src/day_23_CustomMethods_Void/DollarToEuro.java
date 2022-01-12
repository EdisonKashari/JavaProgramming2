package day_23_CustomMethods_Void;

public class DollarToEuro {
    public static void main(String[] args) {
        dollarToEuro(5);
    }
    public static void dollarToEuro(int dollar){
        double convert = dollar* 0.89;
        System.out.println(convert);
    }
}
/* create a method that can convert dollar to euro*/