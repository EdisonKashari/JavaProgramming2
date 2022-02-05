package day_44_Abstraction.Animal;

public class Lion extends Animal implements Wild{
    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating the cow");
    }

    @Override
    public boolean wild() {
        return true;
    }
}
