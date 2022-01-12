package day_36_Inheritance.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
   public String PO;
   public String BA;
   public String SM;

   public  void  setInfo(String PO, String BA, String SM) {
      this.PO = PO;
      this.BA = BA;
      this.SM = SM;
   }

   ArrayList<Tester> testersList = new ArrayList<>();

   ArrayList<Developer> developersList =new ArrayList<>();

   public void addTester(Tester tester){

      testersList.add(tester);
   }
   public void addTesters(Tester[] testers){
      testersList.addAll(Arrays.asList(testers));

   }

   public void removeTester(int id){
      testersList.removeIf(p->p.id==id);
   }

   public void addDeveloper(Developer developer){
      developersList.add(developer);
   }
   public void addDeveloper(Developer[] developers){
      developersList.addAll(Arrays.asList(developers));

   }
   public void removeDeveloper(int id){
      developersList.removeIf(p->p.id==id);
   }

   public String toString() {
      return "ScrumTeam{" +
              "PO=" + PO +
              ", BA=" + BA +
              ", SM=" + SM +
              ", testersList=" + testersList.size() +
              ", developersList=" + developersList.size() +
              '}';
   }
}
