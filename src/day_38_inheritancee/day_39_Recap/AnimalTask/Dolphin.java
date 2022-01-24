package day_38_inheritancee.day_39_Recap.AnimalTask;

public class Dolphin extends FriendlyAnimal{
    public Dolphin(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+getBreed()+" is eating delphin food");
    }

    public void swim(){
        System.out.println(getName()+" "+getBreed()+" is swiming");
    }
}
