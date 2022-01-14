package day_39_Recap.CydeoTask;

public class Employee extends Person {

    private int employeeId,salary;
    private String jobTitle;

    public Employee(String name, int age, char gender, int employeeId, int salary, String jobTitle) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
