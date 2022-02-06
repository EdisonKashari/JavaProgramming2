package day_44_Abstraction.Car;

public class CarShop {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Corolla",2010,5400,"White");
        Honda honda = new Honda("Honda","Accord",2010,5200,"Black");
        Bmw bmw = new Bmw("BMW","X5",2020,25500,"Gray");
        Audi audi = new Audi("Audi","Q7",2019,25712,"Red");
        Mercedez mercedez = new Mercedez("Mercedes","ML",2017,34021,"White");
        Tesla tesla = new Tesla("Tesla","Dual",2019,54774,"Red");
        Nio nio = new Nio("Nio","Et7",2022,45000,"Green");
        CydeoCar cydeoCar = new CydeoCar("Cydeo","WoodenSpoon",2014,1000000,"Blue");

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(mercedez);
        System.out.println(tesla);
        System.out.println(nio);
        System.out.println(cydeoCar);




    }
}
