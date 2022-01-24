package day_38_inheritancee.day_39_Recap.AnimalTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Lucy","Husky","White","Small",'M',2,true,false,true);

        Cat cat =new Cat("Li","Al","Black","Medium",'M',6,true,true,true);

        Dolphin dolphin = new Dolphin("Ali","Fin","White","Large",'M',4,true,false,true);


        Parrot parrot = new Parrot( "Ezel","Ali","Black","Small",'F',2,true,false,false);


        Lion lion = new Lion("Kenan","Gengiz","White","Medium",'M',4,true,false,true);


        Tiger tiger = new Tiger("Ali","TT","Red","Small",'M',5,true,false,true);

        Eagle eagle =new Eagle("Serdar","GoodEagle","Black","Small",'M',14,true,false,true);

        Bear bear= new Bear("Masha","Stronger", "Black","Medium",'F',14,false,true,false);

        Python python = new Python("Snake","Dangerous","Black","Medium",'F',10,true,false,true);

        Crocodile crocodile = new Crocodile("Crocodile", "Killer","Green","Large",'M',14,false,true,true);


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(dolphin);
        System.out.println(parrot);
        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(eagle);
        System.out.println(bear);
        System.out.println(python);
        System.out.println(crocodile);

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        cat.eat();
        cat.scratch();

        dolphin.eat();
        dolphin.swim();

        parrot.eat();
        parrot.fly();


        lion.hunt();

        tiger.hunt();

        eagle.hunt();

        bear.hunt();

        python.hunt();

        crocodile.hunt();





        ArrayList<FriendlyAnimal> list = new ArrayList<>();

        list.addAll(Arrays.asList(dog,cat,dolphin,parrot));

        for (FriendlyAnimal each : list) {
            System.out.println(each.getName()+" : " + each.getSize());
        }

        ArrayList<Zoo> list1 = new ArrayList<>();






    }
}
