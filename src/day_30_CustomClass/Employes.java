package day_30_CustomClass;

public class Employes {
    public String name;
    public int iD;
    public char gender;
    public String jobtitle;
    public int salary;
    public boolean isFullTime;

    public void setInfo(String name, int iD, char gender, String jobtitle, int salary, boolean isFullTime) {
        this.name = name;
        this.iD = iD;
        this.gender = gender;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employes{" +
                "name='" + name + '\'' +
                ", iD=" + iD +
                ", gender=" + gender +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*Employee Class:

        Attributes:
            name, id, gender, jobTitle, salary, isFullTime(boolean)

        Actions:
            toString(): to be bale to print each employee object
            setInfo(): to be able to set all the attributes
            work()...

CapitalOne Class:

    1. create 5 Employee objects
    2. store those 5 employee objects into an array
    3. how many employees are full time employees?
    4. What's the minimum salary
    5. what's the maximum salary*/