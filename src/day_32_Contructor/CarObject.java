package day_32_Contructor;

public class CarObject {

    public static void main(String[] args) {
        Car car1= new Car("Honda");
        Car car2 = new Car("Honda","Accord");
        Car car3 = new Car("Honda","Pilot",2010);
        Car car4 = new Car("Ford","Focus",2020,25000);
        Car car5 = new Car("Tesla","Dual",2021,35000,"Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }



}
