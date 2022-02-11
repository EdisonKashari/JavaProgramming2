package day_44_Abstraction.Animal;

public class Shark extends Animal implements Swimable,Wild {
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" ia eating people");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" is swiming");
    }


    @Override
    public void hunt() {
        System.out.println(getName() +" is hunt for fish");
    }
}
