package day_36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Max","Husky",2,'M',"Large","Black");
        dog1.bark();
        dog1.sleep();
        dog1.drink();
        dog1.move();
        dog1.eat();

        System.out.println(dog1);

        Cat cat1 = new Cat();
        cat1.setInfo("Fistik","outside cat",3,'M',"Small","orange");
        cat1.eat();
        cat1.sleep();
        cat1.drink();
        cat1.move();
        cat1.scratch();

        System.out.println(cat1);

        Tiger tiger1 = new Tiger();

        tiger1.setInfo("Tarcin","British",5,'M',"Medium","Red");

        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        tiger1.move();
        tiger1.hunt();
        tiger1.roar();


        System.out.println(tiger1);

    }
}
