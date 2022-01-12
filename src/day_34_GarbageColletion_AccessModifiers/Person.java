package day_34_GarbageColletion_AccessModifiers;

public class Person {
    public String name,language;//public access modifier to reusble to other clasess or packages
    public int age;//field or instances variables
    public char gender;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, String language,int age, char gender) {
        this.name = name;//this....is used to call instances
        this.language = language;//constructor to set the instances
        this.age = age;
        this.gender = gender;
    }

    static {
        isHuman=true;
        hasNose=true;
        numberOfWings=2;//initializing the static
        numberOfHead=2;
        planet="Earth";
    }
    public static void printPlanetName(){//if we need to use any instances we have to use only public void
        System.out.println(planet);
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public  void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {//is instance variables
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", plane=" + planet +
                ", isHuman=" + isHuman +
                ", hasNose=" + hasNose +
                ", numberOfWings=" + numberOfWings +
                ", numberOFHead=" + numberOfHead +
                '}';
    }
}
/* Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()*/