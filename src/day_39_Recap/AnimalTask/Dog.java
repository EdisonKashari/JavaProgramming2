package day_39_Recap.AnimalTask;

public class Dog extends FriendlyAnimal{
    public Dog(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+ getBreed()+" is eating dog food");
    }
    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
