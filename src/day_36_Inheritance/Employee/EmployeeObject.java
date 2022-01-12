package day_36_Inheritance.Employee;

public class EmployeeObject {
    public static void main(String[] args) {
        Developer developer1 = new Developer();

        developer1.coding();
        developer1.fixingBugs();
        developer1.work();

        System.out.println(developer1);

        Tester tester1 = new Tester();
        tester1.work();
        tester1.testing();
        tester1.creatingTicket();

        System.out.println(tester1);

        Driver driver1 = new Driver();

        driver1.drivering();
        driver1.work();

        System.out.println(driver1);

        Teacher teacher1 = new Teacher();

        teacher1.teaching();
        teacher1.work();

        System.out.println(teacher1);


    }
}
