package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {

    public static void main(String[] args) {
                   // car object
        Car car1 = new Car();
        car1.setInfo("Honda","Accord","White",2010,5200);
        Car car2 = new Car();
        car2.setInfo("Toyota","Camry","Black",2019,8000);
      //  System.out.println(car2);
        //System.out.println(car1);
        car1.drive();
        car2.start();
        car2.stop();

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2));

        for (Car each : carList) {
            System.out.println(each.brand+" : "+ each.price);



        }
        System.out.println("-----------------------------------------------------------");
        //               p mean represent each car brand
        carList.removeIf(p->p.brand.equals("Honda") && p.year >= 2005 && p.year<= 2008);
        carList.removeIf(p->p.brand.equals("Toyota")&& p.year>= 1990 && p.year<=2000);

        System.out.println(carList);

    }
}
