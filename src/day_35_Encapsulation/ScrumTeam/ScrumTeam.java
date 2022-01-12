package day_35_Encapsulation.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
private String   PO, BA, SM;
private int dayOfSprint;
    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> devopsList = new ArrayList<>();

    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
       setDayOfSprint(dayOfSprint);
    }

    public int getDayOfSprint() {
        return dayOfSprint;
    }

    public void setDayOfSprint(int dayOfSprint) {
        this.dayOfSprint = dayOfSprint;
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

  /*  public void addTester(day_31_Constructors.scrumTask.Tester tester){
        testersList.add(tester);
    }

    public void addTesters(day_31_Constructors.scrumTask.Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(day_31_Constructors.scrumTask.Developer developer){
        devopsList.add(developer);

    }
    public void addDevelopers(day_31_Constructors.scrumTask.Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }
    public void  removeTester(long employeeID){
        testersList.removeIf(p->p.employeeID==employeeID);
    }
    public void  removeDeveloper(long employeeID){
        devopsList.removeIf(p->p.employeeID==employeeID);
    }
*/

}
/*Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM

	             Actions:
	                  addTester(Tester tester): adds the given tester to the testers ArrayList

	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	                  removeTester(long employeeID): removes the given tester from the testers ArrayList

	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	                  toString(): prints number of tester,& developers,  PO name, SM name, BA name*/