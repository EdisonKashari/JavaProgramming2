package day_33_Statics.day_33_Statics;

public class Dog {

    public String breed,color,size,name;
    public int age;
    public char gender;
    public static int numberOfLegs= 4,numberOfEyes = 2,numberOfWings = 0;
    public static boolean isFriendly = true;

    public Dog(String breed, String color, String size,String name, int age, char gender) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.gender = gender;
        this.name=name;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }
    public void play(){
        System.out.println(name + " is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
*/