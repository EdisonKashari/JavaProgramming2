package day_39_Recap.DeviceTask;

public class Samsung extends Phone{

    public Samsung(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" "+ getModel() + " is  turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" "+ getModel() + " is  turning off");
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " is calling "+ 987654321);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " is texting to "+ 852741963);
    }

    public void downloadSongsForFree(){
        System.out.println(getBrand()+" " + getModel()+ " is downloading songs for free");
    }
}
