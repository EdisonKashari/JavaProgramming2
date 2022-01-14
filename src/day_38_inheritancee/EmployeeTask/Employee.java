package day_38_inheritancee.EmployeeTask;

public class Employee {

    public String name,jobTitle,companyName;
    public int age,id;
    public double salaryName;
    public char gender;

    public Employee(String name, String jobTitle, String companyName, int age, int id, double salaryName, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.id = id;
        this.salaryName = salaryName;
        this.gender = gender;
    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salaryName=" + salaryName +
                ", gender=" + gender +
                '}';
    }
}
