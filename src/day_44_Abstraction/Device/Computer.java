package day_44_Abstraction.Device;

public class Computer extends Device {

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" is turning on");


    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" is turning off");

    }

    public void touchscreen(){
        System.out.println(getBrand()+" is touch screen");
    }


}
