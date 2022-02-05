package day_44_Abstraction.Animal;

public class Eagle extends Animal implements Wild,Flyable{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake");

    }

    @Override
    public boolean wild() {
        return true;
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " is flying");
    }
}
