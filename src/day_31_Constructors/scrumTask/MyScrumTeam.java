package day_31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Farangez","SeniorSDET",150000,2541);
        Tester tester2 = new Tester("Farangis","SDET",140000,2441);
        Tester tester3 = new Tester("Kerem","QA",130000,2041);
        Tester tester4 = new Tester("Duygu","QA",100000,2511);


        Developer developer1 = new Developer("Muhtar","Developer",160000,8789);
        Developer developer2 = new Developer("Ali","Senior",140000,8089);
        Developer developer3 = new Developer("Kuzzat","Developer",120000,8709);
        Developer developer4 = new Developer("Ahmet","Junior",100000,8711);
        Developer developer5 = new Developer("Anna","Developer",125000,8700);

        ScrumTeam scrumTeam1 = new ScrumTeam("Magda","Hulya","Damla",10);

        Tester [] testers = {tester1,tester2,tester3,tester4};
        Developer[] developers={developer1,developer2,developer3,developer4,developer5};
        scrumTeam1.addTesters(testers);
        scrumTeam1.addTester(tester1);
        scrumTeam1.addDevelopers(developers);
        scrumTeam1.removeDeveloper(8700);

        for (Tester eachtester : testers) {
            System.out.println(eachtester.name+" "+ eachtester.salary);
        }



        System.out.println(scrumTeam1);


    }
}
/*create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team*/