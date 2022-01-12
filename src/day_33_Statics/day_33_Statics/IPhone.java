package day_33_Statics.day_33_Statics;

public class IPhone {
    public String model,color;
    public double price;
    public double size;
    public static String brand="iPhone";
    public static String OS = "IOS";
    public static String madeIn = "madeInChina";

    public IPhone(String model, String color, double price, double size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public void brand (){
        System.out.println(brand);
    }
    public void OS (){
        System.out.println(OS);
    }
    public void madeIn(){
        System.out.println(madeIn);
    }

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(email);
    }
    public void call(long phoneNumber){
        System.out.println(phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}

/*IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()*/
