package day_38_inheritancee.day_39_Recap.DeviceTask;

public class Device {

    private String brand,model;
    private double price;
    private boolean hasBattery=true,hasPowerButton =true;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand==null || brand.isEmpty() || brand.isBlank()){
            System.err.println(brand+" is invalid");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model==null || model.isEmpty() || model.isBlank()){
            System.err.println(model+" is invalid");
            System.exit(1);
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.err.println(price+" is negativ price");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public Device(String brand, String model, double price,boolean hasBattery,boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public void turnOn(){
        System.out.println(brand + " " + model+" is turning on");
    }
    public void turnOff(){
        System.out.println(brand + " " + model+" is turning off");
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery='" + true + '\'' +
                "hasPowerButton='" + true + '\'' +
                '}';
    }
}
