package day_38_Inheritance.CarTask;

public class CarObject {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Corolla",2010,10050,"White",125000);

        toyota.reliable();
        toyota.drive();

        Tesla tesla = new Tesla("Tesla","Dual S",2021,25.000,"Black",20000);

        tesla.autoPilot();


        BMW bmw = new BMW("BMW","X5",2010,21000,"Red",35000);

        bmw.breaksDown();
        bmw.racing();

        System.out.println(toyota);
        System.out.println(tesla);
        System.out.println(bmw);
    }
}
