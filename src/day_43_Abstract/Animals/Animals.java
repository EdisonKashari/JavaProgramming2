package day_43_Abstract.Animals;

public abstract class Animals {

    private String name;
    private String breed;
    private int age;
    private char gender;
    private String size;
    private String color;

    public Animals(String name, String breed, int age, char gender, String size, String color) {
        this.name = name;
        this.breed = breed;
        setAge(age);
        setGender(gender);
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("Invalid data "+ age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (!(gender=='M' || gender=='F')){
            throw new RuntimeException("Invalid data "+gender);
        }
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void eat();

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


