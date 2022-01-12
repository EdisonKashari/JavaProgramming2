package day_37_Inheritance.AnimalTask;

public class Cat extends Animal{


    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void scratch(){

        System.out.println(name+" is scratching");
    }
}
