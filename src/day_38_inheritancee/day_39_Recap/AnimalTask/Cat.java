package day_38_inheritancee.day_39_Recap.AnimalTask;

public class Cat extends FriendlyAnimal{


    public Cat(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+ getBreed()+" is eating cat food");
    }

    public void scratch(){
        System.out.println(getName()+" " + getBreed() +" is scratching");
    }

    public void meow(){
        System.out.println(getName()+" "+ getBreed()+" is meowing");
    }
}
