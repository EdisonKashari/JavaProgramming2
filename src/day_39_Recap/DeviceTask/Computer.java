package day_39_Recap.DeviceTask;

public class Computer extends Device {
    private boolean hasTouchScreen;



    public boolean isHasTouchScreen() {
        return hasTouchScreen;
    }

    public void setHasTouchScreen(boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
    }

    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, boolean hasTouchScreen) {
        super(brand, model, price, hasBattery, hasPowerButton);
       setHasTouchScreen(hasTouchScreen);
    }

    public void OS (){
        System.out.println(getBrand()+" "+ getBrand()+" has a Windows");

    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery='" + true + '\'' +
                ", hasPowerButton='" + true + '\'' +
                "hasTouchScreen=" + hasTouchScreen +
                '}';
    }
}
