package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObject {
    public static void main(String[] args) {
       //create a new object
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        // we puting the data in the each object
        cat1.setInfo("Lea","White",2,'F',"Large");
        cat2.setInfo("CatOne","Black",4,'M',"Small");
        cat3.setInfo("CatTwo","Gray",1,'F',"Medium");
        cat4.setInfo("CatThree","White",5,'M',"Large");
        cat5.setInfo("Jack","Yellow",3,'F',"Large");

        //storing each object in one array
        Cat [] cats = {cat1,cat2,cat3,cat4,cat5};

        ArrayList<Cat> oldeThanTwo = new ArrayList<>();
        oldeThanTwo.addAll(Arrays.asList(cats));

        oldeThanTwo.removeIf(p-> p.age<3);

        ArrayList<Cat> femaleCat = new ArrayList<>();
        femaleCat.addAll(Arrays.asList(cats));

        femaleCat.removeIf(p->p.gender=='M');

        System.out.println("femaleCat = " + femaleCat.size());



        System.out.println("oldeThanTwo = " + oldeThanTwo);

int count= 0;
        for (Cat each : cats) {
            System.out.println(each);
            if (each.size.equals("Large")){
                count++;

            }


        }
        System.out.println("Large size = " + count);



    }
}






















