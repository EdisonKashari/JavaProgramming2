package day_43_Abstract.Car;

public class CarShop {
    public static void main(String[] args) {



        Honda honda = new Honda("Accord","White",2010,5200);

        Audi audi = new Audi("A6","Black",2020,25000);

        Tesla tesla = new Tesla("S","Red",2021,50000);




        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println("---------------------------------------------------------------------");
        honda.setColor("Red");
        audi.setColor("White");
        tesla.setColor("Black");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println("---------------------------------------------------------------------");
        honda.start();
        honda.stop();


        audi.start();
        audi.stop();

        tesla.autopilot();
        tesla.start();
    }
}
