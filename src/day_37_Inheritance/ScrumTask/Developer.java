package day_37_Inheritance.ScrumTask;

public class Developer extends  Employee{


    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void code(){
        System.out.println(jobTitle + " " +name + "is coding");
    }
    public void fixBug(){
        System.out.println(jobTitle + " " +name + "is crying");
    }
}
