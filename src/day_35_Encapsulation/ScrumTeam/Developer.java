package day_35_Encapsulation.ScrumTeam;

public class Developer {

    private String name;
    private int employeeID;
    private String JobTitle;
    private double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID<=0){
            return;
        }
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary<0){
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


