package day_38_inheritancee.day_39_Recap.StateTask;

public class Virginia extends State {

    public Virginia(String name, String governor, String senator, String politicalParty, String abbreviation, double population, double stateTax) {
        super(name, governor, senator, politicalParty, abbreviation, population, stateTax);
    }

    public void firstTHG(){
        System.out.println(getName()+"celebrate the first ThanksGiving");
    }
}
