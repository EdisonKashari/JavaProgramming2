package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
public class PhoneObject {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();
        Phone phone5 = new Phone();

        phone1.setInfo("Iphone","IOS","black",1000,5.2);
        phone2.setInfo("Samsung","Android","white",900,4.2);
        phone3.setInfo("Nokia","Android","Gray",500,6.2);
        phone4.setInfo("Motorola","Android","red",700,3.2);
        phone5.setInfo("Siemens","IOS","yellow",400,5.8);
        Phone [] phones= {phone1,phone2,phone3,phone4,phone5};

       ArrayList<Phone> softwareAndroid = new ArrayList<>();
       softwareAndroid.addAll(Arrays.asList(phone1,phone2,phone3,phone4,phone5));

      softwareAndroid.removeIf(p->p.software.equals("IOS"));
        for (Phone each : softwareAndroid) {
            System.out.println(each.brand + " " + each.software);
        }

        // find max price
        int maxprice=phone1.price;
        ArrayList<Phone> maxPrice = new ArrayList<>();
        maxPrice.addAll(Arrays.asList(phones));

        for (Phone each : maxPrice) {
            if (each.price>maxprice){
                maxprice=each.price;
            }
        }

        System.out.println("maxprice = " + maxprice);

        ArrayList<Phone> minSize = new ArrayList<>();
        minSize.addAll(Arrays.asList(phone1,phone2,phone3,phone4,phone5));
double minsize= phone1.size;
        for (Phone each : minSize) {
            if (each.size<minsize){
                minsize=each.size;
            }
        }

        System.out.println("minsize = " + minsize);





    }
}
