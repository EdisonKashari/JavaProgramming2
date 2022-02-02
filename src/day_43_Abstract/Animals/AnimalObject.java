package day_43_Abstract.Animals;

public class AnimalObject {
    public static void main(String[] args) {


Dog dog = new Dog("Lucy","Husky",5,'M',"Large","White");

Cat cat = new Cat("Anna","OutsideCat",4,'F',"Small","Black");

Tiger tiger = new Tiger( "Rocky","Balboa",2,'M',"Large","Yellow");

Eagle eagle = new Eagle("Pluton","Crazy",1,'M',"Medium","Black");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);
        System.out.println(eagle);
        System.out.println("--------------------------------------------------------------");

        dog.eat();
        cat.eat();
        tiger.eat();
        eagle.eat();
    }
}
