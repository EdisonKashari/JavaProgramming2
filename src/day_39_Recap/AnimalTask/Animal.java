package day_39_Recap.AnimalTask;

public class Animal {

    private String  name,breed,color,size;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.isBlank() || name.isEmpty()){
            System.out.println(name+" is invalid");
            System.exit(1);
        }

        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null || breed.isEmpty() || breed.isBlank()){

            System.err.println(breed+" is invalid");
            System.exit(1);
        }

        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null || color.isBlank() || color.isEmpty()){
            System.err.println(color+" is invalid");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender=='F')){
            System.err.println(gender+" is invalid");
            System.exit(1);

        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println(age+" is negativ number");
            System.exit(1);
        }
        this.age = age;
    }

    public Animal(String name, String breed, String color, String size, char gender, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setSize(size);
        setGender(gender);
        setAge(age);
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void move(){
        System.out.println(name+" is moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
