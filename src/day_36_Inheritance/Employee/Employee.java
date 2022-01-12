package day_36_Inheritance.Employee;

public class Employee {
    public String name,jobTitle;
    public char gender;
    public double salary;
    public int id,age;

    public void setInfo(String name, String jobTitle, char gender, double salary, int id, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.id = id;
        this.age = age;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
