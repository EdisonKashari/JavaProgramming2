package day_43_Abstract.Animals;

public class Tiger extends Animals{
    public Tiger(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+ getBreed()+" is eating deer");

    }
}
