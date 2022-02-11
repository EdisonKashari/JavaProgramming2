package day_44_Abstraction.Car;

public class Nio extends Car implements AutoPilot{
    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel()+" is self driving");

    }
    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" is starting");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" is driving");

    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" " + getModel()+" is autoparking");

    }
}
