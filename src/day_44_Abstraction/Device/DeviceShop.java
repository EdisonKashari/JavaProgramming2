package day_44_Abstraction.Device;

public class DeviceShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("13", 1200, "White", "Small", true, true);
        Samsung samsung = new Samsung("Galaxy", "S10", 690, "Black", "Medium", false, false);
        Google google = new Google("Google", "Pix", 680, "Green", "Small", true, false);

        PersonalComputer personalComputer = new PersonalComputer("HP", "Envy", 1200, "Grey", "Large", false, true);
        Desktop desktop = new Desktop("MacBook", "Last", 1500, "Red", "Large", true, false);
        Laptop laptop = new Laptop("Dell", "BlaBla", 1500, "Green", "Large", true, false);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(google);
        System.out.println(personalComputer);
        System.out.println(desktop);
        System.out.println(laptop);

        iphone.downloadAPP();
        iphone.call(254545);
        iphone.text(2454786);
        iphone.turnOn();
        iphone.turnOff();
        samsung.downloadAPP();
        google.downloadAPP();


    }
}
