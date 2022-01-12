package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WatchesObject {
    public static void main(String[] args) {

        Watches watches1 = new Watches();
        Watches watches2 = new Watches();
        Watches watches3 = new Watches();
        Watches watches4 = new Watches();
        Watches watches5 = new Watches();

        watches1.setInfo("Rolex",5000,'M',"Excellent",1150);
        watches2.setInfo("Omega",4500,'F',"New",5547);
        watches3.setInfo("Cartier",3500,'F',"Good Condition",5547);
        watches4.setInfo("Citizen",450,'M',"New",5547);
        watches5.setInfo("Apple",300,'F',"New",5547);

        Watches [] watches = {watches1,watches2,watches3,watches4,watches5};


        ArrayList<Watches> femaleWatches = new ArrayList<>();
        femaleWatches.addAll(Arrays.asList(watches));
        femaleWatches.addAll(Arrays.asList(watches1,watches2));

        System.out.println(femaleWatches);

        int maxPrice = watches2.price;


        for (Watches each : femaleWatches) {
            if (each.price>maxPrice && each.gender == 'F'){
                maxPrice= each.price;

                femaleWatches.add(each);
                System.out.println(femaleWatches);
            }
        }
        int finalMaxPrice=maxPrice;
       femaleWatches.removeIf(p->p.gender=='M');
       femaleWatches.removeIf(p->p.price<finalMaxPrice);

        for (Watches each1 : femaleWatches) {
            System.out.println(each1.brand+" "+each1.gender+" " + each1.price);
        }





    }


}
