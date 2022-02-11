package day_44_Abstraction.Animal;

public class Parrot extends Animal implements Plyable,Flyable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");

    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly 20 km/h ");
    }
}
