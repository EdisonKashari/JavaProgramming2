package day_36_Inheritance.ScrumTeam;

import day_30_CustomClass.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {




        ProductOwner productOwner= new ProductOwner();
        productOwner.setInfo(25,"PO",200000,"Kuzzat",45,'M');

        ScrumMaster scrumMaster = new ScrumMaster();

        scrumMaster.setInfo(45,"SM",145000,"Ali",43,'M');



        BusinessAnalyst businessAnalyst = new BusinessAnalyst();

        businessAnalyst.setInfo(35,"BA",170000,"Omer",34,'M');

        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        Tester tester4 = new Tester();
        Tester tester5 = new Tester();

        tester1.setInfo(12,"Sdet",122500,"Edison",27,'M');
        tester2.setInfo(14,"QA",125500,"Le",31,'F');
        tester3.setInfo(18,"Sdet",112500,"Li",25,'M');
        tester4.setInfo(17,"QA",125500,"LO",31,'M');
        tester5.setInfo(19,"Sdet",132500,"La",35,'F');

        Tester [] testers ={tester1,tester2,tester3,tester4,tester5};


        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();
        Developer developer5 = new Developer();

        developer1.setInfo(21,"Developer",170000,"Ali",25,'M');
        developer2.setInfo(17,"SeniorDeveloper",160000,"Sinem",27,'F');
        developer3.setInfo(25,"JuniorDeveloper",180000,"Hulya",21,'F');
        developer4.setInfo(28,"Developer",140000,"Ahmet",37,'M');
        developer5.setInfo(29,"MasterDeveloper",180000,"Muhtar",47,'M');

        Developer [] developers = {developer1,developer2,developer3,developer4,developer5};


        ScrumTeam scrumTeam1= new ScrumTeam();

        scrumTeam1.setInfo("Magda","Duygu","Farangez");

        scrumTeam1.addDeveloper(developer1);
        scrumTeam1.addTester(tester1);

        scrumTeam1.addTesters(testers);
        scrumTeam1.addDeveloper(developers);
        System.out.println(scrumTeam1);
       // ArrayList<AmazonInc> list = new ArrayList<>();

     //   list.addAll(Arrays.asList(testers));


       // scrumTeam1.setInfo(scrumTeam1.PO, scrumTeam1.BA,scrumTeam1.SM);

      /*  for (Developer each : developers) {
            System.out.println(each.name+" " + each.salary);
        }

        System.out.println(scrumTeam1);
*/



    }
}
