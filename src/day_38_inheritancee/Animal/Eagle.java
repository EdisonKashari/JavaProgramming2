package day_38_inheritancee.Animal;

public class Eagle extends Animal{
    public Eagle(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name+" "+breed+" is eating snake");
    }
}
