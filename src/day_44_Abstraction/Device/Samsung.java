package day_44_Abstraction.Device;

import static day_44_Abstraction.Device.AppleApps.appStoreName;

public class Samsung extends Phone implements AndroidApps, Downloadable {
    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadAPP() {
        System.out.println(getBrand() + " is " + oS + " and is downloading an App from " + androidAppstoreName);

    }
}
