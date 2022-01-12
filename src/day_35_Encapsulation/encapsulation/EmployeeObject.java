package day_35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Edison",'M',15,-100);

        Employee employee2 = new Employee("Jack",'M',68,100000);
      /*  employee1.setAge(31);
        employee1.setGender('M');
        employee1.setName("");
        employee1.setSalary(105);  */
employee2.setName("Ali");
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
