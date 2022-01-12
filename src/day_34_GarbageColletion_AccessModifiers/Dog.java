package day_34_GarbageColletion_AccessModifiers;

public class Dog {
    public String breed,size,color;
    public char gender;
    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public static boolean isFriendly;

    public Dog(String breed, String size, String color, char gender) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
    }
    static {
        numberOfEyes=2;
        numberOfLegs=4;
        numberOfWings=0;
        isFriendly=true;
    }

    public void eat(){
        System.out.println(breed+" is eating");
    }
    public void drink(){
        System.out.println(breed+" is drinking");
    }
    public void sleep(){
        System.out.println(breed+" is sleeping");
    }
    public void play(){
        System.out.println(breed+" is playing");
    }
    public void bark(){
        System.out.println(breed +" is barking");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", numberOfLegs=" + numberOfLegs +
                ", numberOfWings=" + numberOfWings +
                ", numberOfEyes=" + numberOfEyes +
                ", isFriendly=" + isFriendly +
                '}';
    }
}



/* Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()*/
