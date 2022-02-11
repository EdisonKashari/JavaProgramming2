package day_44_Abstraction.Device;

public class Phone extends Device {
    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
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
    public void call(long phoneNum){
        System.out.println(phoneNum + " is calling " + getBrand());
    }
    public void text(long phoneNum){
        System.out.println(phoneNum+" is texting "+ getBrand());
    }


}
/*
2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()
 */
