package day_44_Abstraction.Device;

public class Google extends Phone implements AndroidApps{
    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Google Phone", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadAPP() {
        System.out.println(getBrand()+" is downloading an app from "+androidAppstoreName);


    }
}
