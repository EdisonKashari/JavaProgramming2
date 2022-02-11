package day_44_Abstraction.Device;

public class Iphone extends Phone implements Downloadable, AppleApps {
    public Iphone(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("IPhone", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadAPP() {

        System.out.println(getBrand() + " is downloading app from " + appStoreName);

    }
}
