package day_36_Inheritance.ScrumTeam;

public class Employee extends Person{
    public int id;
    public String jobTitle;
    public double salary;

    public void setInfo(int id, String jobTitle, double salary,String name,int age,char gender) {
      this.name=name;
      this.age=age;
      this.gender=gender;
      this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;


    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
