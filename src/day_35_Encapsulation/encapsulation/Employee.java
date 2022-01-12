package day_35_Encapsulation.encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);//check if the name is valid
        setGender(gender);
        setAge(age);
       setSalary(salary);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.isEmpty()){
           // System.err.println(name+" is empty");
          //  System.exit(0);
            return;
        }

        this.name=name;
    }

    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        if (!(gender=='M' || gender == 'F')){
          //  System.err.println("invalid gender " + gender);
           // System.exit(0);
            return;

        }
        this.gender=gender;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<=16 || age>60){
          //  System.err.println("Invalid age: "+ age);
            //System.exit(0);
            return;
        }

        this.age=age;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if (salary<=0 ){
         //   System.err.println("invalid salary " + salary );
           // System.exit(0);
            return;
        }
        this.salary=salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*  Create an Employee Class:
            private variables:
                name, gender, age, salary

            Encapsulate all the private fields

                1. Name can not be empty
                2. gender can not anything other than female or male
                3. age can not be zero , negative or greater than 150
                4. salary can not be zero or negative */