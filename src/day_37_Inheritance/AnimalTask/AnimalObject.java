package day_37_Inheritance.AnimalTask;

public class AnimalObject {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucy","Husky",3,'M',"Large","White");

        dog1.bark();

        System.out.println(dog1);

        Cat cat1 = new Cat("Anna","Siamese",2,'F',"Medium","Black");

        cat1.scratch();

        System.out.println(cat1);

        Parrot parrot1= new Parrot("King","Macay",2,'M',"Large","Blue","White");

        parrot1.sing();

        System.out.println(parrot1);
    }
}
