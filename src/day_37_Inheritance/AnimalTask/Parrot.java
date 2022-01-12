package day_37_Inheritance.AnimalTask;

public class Parrot extends Animal{

   public String parrotWingColor;
    public Parrot(String name, String breed, int age, char gender, String size, String color,String parrotWingColor) {
        super(name, breed, age, gender, size, color);
        this.parrotWingColor=parrotWingColor;
    }

    public void sing(){
        System.out.println(name +" is singing");
    }
}
