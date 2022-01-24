package day_38_inheritancee.day_39_Recap.DeviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void channelUp(){
        System.out.println(getBrand()+" " + getModel()+" is changing chanel up");
    }
    public void channelDown(){
        System.out.println(getBrand()+" " + getModel()+" is changing chanel down");
    }
}
