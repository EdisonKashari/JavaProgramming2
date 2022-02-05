package day_44_Abstraction.Animal;

public class Falcon extends Animal implements Wild,Flyable{
    public Falcon(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating falcon food");
    }

    @Override
    public boolean wild() {
        return true;
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying");
    }
}
