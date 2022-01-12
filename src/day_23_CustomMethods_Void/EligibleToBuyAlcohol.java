package day_23_CustomMethods_Void;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        eligibleToVote(19);
    }
    public static void eligibleToVote (int age){
        if (age >= 18 && age <= 115){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }
}
/* create a method that can check if a person is eligible to buy alcohol*/