package day_30_CustomClass;

public class Car {
//   atributes
    public String brand;
    public String model;
    public String color;
    public int year;
    public double  price;



    public void setInfo( String carName,String carModel,String carColor,int carYear,double carPrice ){
brand = carName;
model= carModel;
color=carColor;
year=carYear;
price=carPrice;

    }

    public void  drive(){
        System.out.println(brand+" is driving");

    }
    public void stop(){
        System.out.println(brand+" is stopped");
    }
    public void start(){
        System.out.println(brand+" started");

    }


    public String toString() {
        return "Car{" +
                "name='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}



/*Car Class:

    Attributes:
        brand, model, color, year, price

    Actions:
        drive(), start(), stop(), toString(), setInfo()


Student Class:

    Attributes:
        name, gender, age, studentID

    Actions:
        eat(), sleep(), drink(), code()
        setInfo(): to set all the attributes of student object
        toString(): to print the full info of student  */