package day_30_CustomClass;

public class Watches {

    public String brand;
    public int price;
    public char gender;
    public String condition;
    public int modelNumber;

    public void setInfo(String brand, int price, char gender, String condition, int modelNumber) {
        this.brand = brand;
        this.price = price;
        this.gender = gender;
        this.condition = condition;
        this.modelNumber = modelNumber;
    }

    public String toString() {
        return "Watches{" +
                "brand='" + brand + '\'' +
                ", price=$" + price +
                ", gender=" + gender +
                ", condition='" + condition + '\'' +
                ", modelNumber=" + modelNumber +
                '}';
    }


}
