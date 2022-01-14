package day_38_inheritancee.Animal;

public class Tiger extends Animal{
    public Tiger(String name, String breed, String size, String color, int age, char gender) {
        super(name, breed, size, color, age, gender);

    }

    @Override
    public void eat() {
        System.out.println(name+" "+breed+"eats deer");
    }
}
