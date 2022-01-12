package day_30_CustomClass;

public class Phone {
    public String brand;
    public  String software;
    public String color;
    public int price;
    public double size;

    public void setInfo(String brand, String software, String color, int price, double size) {
        this.brand = brand;
        this.software = software;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", software='" + software + '\'' +
                ", color='" + color + '\'' +
                ", price=$" + price +
                ", size=" + size +
                '}';
    }
}
