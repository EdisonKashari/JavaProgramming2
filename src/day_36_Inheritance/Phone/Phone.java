package day_36_Inheritance.Phone;

public class Phone {

    public String brand,model,color,size;
    public double price;

    public void  setInfo(String brand, String model, String color, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" is calling");
    }
    public void text(long phoneNumber){
        System.out.println(brand+" is texting");
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
