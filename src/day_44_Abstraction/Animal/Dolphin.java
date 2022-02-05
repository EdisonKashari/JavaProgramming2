package day_44_Abstraction.Animal;

public class Dolphin extends Animal implements Plyable,Swimable{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swiming");
    }
}
