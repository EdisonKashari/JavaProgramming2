package day_38_inheritancee.day_39_Recap.DeviceTask;

public class Laptop extends Computer{


    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, boolean hasTouchScreen) {
        super(brand, model, price, hasBattery, hasPowerButton, hasTouchScreen);
    }

    @Override
    public void OS() {
        System.out.println(getBrand()+" "+getModel()+" has Windows");
    }
}
