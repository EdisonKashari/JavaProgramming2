package day_39_Recap.DeviceTask;

public class Iphone extends Phone{

    public Iphone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" "+ getModel() + " is trying to turn on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" "+ getModel() + " is trying to turn off");
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " is calling "+ 147258369);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " is calling "+321654789);
    }
}
