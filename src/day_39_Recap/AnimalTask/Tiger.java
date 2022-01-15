package day_39_Recap.AnimalTask;

public class Tiger extends WildAnimal{
    public Tiger(String name, String breed, String color, String size, char gender, int age, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, size, gender, age, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" "+ getBreed()+" is looking for deer");
    }
}
