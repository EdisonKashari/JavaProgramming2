package day_39_Recap.AnimalTask;

public class Parrot extends FriendlyAnimal{
    public Parrot(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" "+getBreed()+" is eating parrot food");
    }
    public void fly(){
        System.out.println(getName()+" "+ getBreed()+" is flying");
    }
    public void sing(){
        System.out.println(getName()+" "+getBreed()+" is singing");
    }
}
