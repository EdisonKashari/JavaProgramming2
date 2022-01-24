package day_38_inheritancee.day_39_Recap.DeviceTask;

public class Phone extends Device{
    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber){
        System.out.println(getBrand()+" "+ getBrand()+" is calling "+ phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand()+" "+ getBrand()+" is texting "+ phoneNumber);
    }


}
