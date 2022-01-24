package day_38_inheritancee.day_39_Recap.StateTask;

public class StateObject {

    public static void main(String[] args) {
        Virginia virginia = new Virginia("Virginia","Glenn Youngkin","Tim Kaine","Democrat","VA",8.536,5.3);

        California california = new California("California","Gavin Newsom","Alex Padilla","Democratic","Ca",39.51,12.3);

        Florida florida = new Florida("Florida","Ron DeSantis","Marco Rubio","Republican","FL",21.48,6);

        Texas texas =new Texas("Texas","Greg Abbott","Ted Cruz","Republican","TX",29,6.25);

        System.out.println(virginia);
        System.out.println(california);
        System.out.println(florida);
        System.out.println(texas);
    }
}
