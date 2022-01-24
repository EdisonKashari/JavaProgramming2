package day_38_inheritancee.day_39_Recap.DeviceTask;

public class Google extends Phone{
    public Google(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " is calling "+ 154578);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " is texting to "+ 123456);
    }
}
