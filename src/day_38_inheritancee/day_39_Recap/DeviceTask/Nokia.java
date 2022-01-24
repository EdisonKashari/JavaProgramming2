package day_38_inheritancee.day_39_Recap.DeviceTask;

public class Nokia extends Phone{
    public Nokia(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " is calling "+ 12024768);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println(getBrand()+ " "+ getModel() + " is calling "+ 24785857);
    }

    public void selfDefense(){
        System.out.println(getBrand()+ " "+getModel()+" we are using for self defense");
    }
}
