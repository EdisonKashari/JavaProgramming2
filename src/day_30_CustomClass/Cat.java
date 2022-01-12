package day_30_CustomClass;

public class Cat {
    // local variable
public String name;
public String color;
public int age;
public char gender;
public String size;
// setInfo(): to be able to set all the attributes
    public void setInfo(String name, String color, int age, char gender, String size) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.size = size;
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is eating");
    }

//toString(): to be able to print each employee object
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                '}';
    }
}
