package day_44_Abstraction.Animal;

public class Cat extends Animal implements Plyable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating Pizza");

    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
