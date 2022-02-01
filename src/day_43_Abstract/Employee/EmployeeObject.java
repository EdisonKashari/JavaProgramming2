package day_43_Abstract.Employee;

public class EmployeeObject {
    public static void main(String[] args) {
        Tester tester = new Tester("John",25,'M',1147,"QA",125000);

        Developer developer = new Developer("Muhtar",26,'M',2545,"Developer",150000);

        Teacher teacher = new Teacher("Asya",26,'F',1478,"Teacher",140000);

        Driver driver = new Driver("Ali",24,'M',2589,"Driver",200000);


        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);
        System.out.println("--------------------------------------------------------------------------------");


        teacher.sleep();
        teacher.work();
        tester.work();
        tester.sleep();
        tester.systemTesting();
        developer.sleep();
        developer.work();

        driver.sleep();
        driver.work();


    }
}
