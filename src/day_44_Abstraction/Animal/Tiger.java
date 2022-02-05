package day_44_Abstraction.Animal;

public class Tiger extends Animal implements Wild {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }

    @Override
    public boolean wild() {
        return true;
    }
}
