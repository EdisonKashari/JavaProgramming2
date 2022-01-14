package day_33_Staticss;

public class Car {

    public String make,model,color;
    public int year;
    public double price;
    public static int  numberOfWheels = 4;
    public static boolean hasBattery=true;
    public static boolean hasSeats = true;

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    public void drive(){
        System.out.println(make+ "is driving");
    }
    public void isHasBattery(){
        System.out.println(true);
    }
    public void isHasSeats(){

        System.out.println(true);
    }
    public void numberOfWheels(){
        System.out.println(numberOfWheels);
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", Has a battery=" + hasBattery +
                '}';
    }
}

/* Car Task:
		1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats

            Add a constructor to initialize all the fields

           Methods:
                drive()
                toString()
*/
