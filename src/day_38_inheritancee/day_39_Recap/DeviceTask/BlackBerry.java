package day_38_inheritancee.day_39_Recap.DeviceTask;

public class BlackBerry extends Phone{

    public BlackBerry(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" "+ getModel() + " is not trying more to turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" "+ getModel() + " is  turning off forever");
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " can't call more to "+ 24789654);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " cant't text more to "+ 357951852);
    }

    public void died(){
        System.out.println(getBrand()+" Unfortunaly died");
    }
}
