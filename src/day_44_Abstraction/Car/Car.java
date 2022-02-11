package day_44_Abstraction.Car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make==null || make.isEmpty()){
            throw new RuntimeException("Invalid data "+ make );
        }
        this.make = make;
        if (model==null || model.isEmpty()){
            throw new RuntimeException("Invalid data "+model);
        }

        this.model = model;
        if (year<1886){
            throw new RuntimeException("Invalid data " + year);
        }
        this.year = year;
        setPrice(price);
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            throw new RuntimeException("Invalid data "+price);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(make+" is using the brakes");
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
