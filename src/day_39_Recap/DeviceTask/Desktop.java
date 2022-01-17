package day_39_Recap.DeviceTask;

public class Desktop extends Computer{


    public Desktop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, boolean hasTouchScreen) {
        super(brand, model, price, hasBattery, hasPowerButton, hasTouchScreen);
    }

    @Override
    public void OS() {
        System.out.println(getBrand()+" " + getModel()+" has Linux");
    }
}
