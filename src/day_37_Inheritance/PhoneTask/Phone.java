package day_37_Inheritance.PhoneTask;

public class Phone {// parent clas: only contain the common features of all the subclass

    public  String brand;
    public String model;
    public double price;
    public String size;
    public String color;

    public static  boolean hasBattery=true;

    public Phone(String brand, String model, double price, String size, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
        this.color = color;

    }


    public void call(long phoneNumber){
        System.out.println(brand+ " "+ model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+" "+ model+" is texting "+ phoneNumber);
    }




    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +

                ", hasBattery=" + hasBattery+
                '}';
    }

}
