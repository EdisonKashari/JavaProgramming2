package day_35_Encapsulation.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        Candies candies1 =new Candies("Li",5,5.5,true);
        Candies candies2 =new Candies("Le",3,7.5,false);
        Candies candies3 =new Candies("La",1,3.5,true);
        Candies candies4 =new Candies("Lo",7,9.5,false);
        Candies candies5 =new Candies("Ly",4,0,true);

        ArrayList<Candies> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(candies1,candies2,candies3,candies4,candies5));

        for (Candies each : candies) {
          //  System.out.println(each.getBrand()+" " +each.getPrice());

           System.out.println("brand: " + each.getBrand() + " price: " + each.getPrice() );
        }
       // System.out.println(candies5);
    }
}
