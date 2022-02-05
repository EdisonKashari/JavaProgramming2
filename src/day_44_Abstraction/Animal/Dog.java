package day_44_Abstraction.Animal;

public class Dog extends Animal implements Plyable{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
