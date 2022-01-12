package day_23_CustomMethods_Void;

public class EligibleToVote {
    public static void main(String[] args) {
        eligibleToVote("USA",25);
    }
    public static void eligibleToVote(String word,int numer){
        if (numer >= 18 && numer<=115 && word.equals("USA")){
            System.out.println("Eligible to vote "+ numer + ", "+"\"" +word+"\"");
        }else {
            System.out.println("You are not eligible to vote!");
        }
    }
}
/*create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!*/