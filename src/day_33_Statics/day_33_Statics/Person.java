package day_33_Statics.day_33_Statics;

public class Person {
    public String name;
    public int age;
    public char gender;
    public static boolean isHuman=true,hasNose=true,hasWings=true;
    public static int numberOfHead=1,numberOfEyes=2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public  void  eat(){
        System.out.println(name + "is eating a banana");

        }
        public void drink(){
            System.out.println(name + " is drinking whisky");
        }
        public void sleep(){
            System.out.println(name+"is sleeping");
        }

        public static  void isIsHuman(){
            System.out.println(isHuman);
    }
    public  static void   HasNose(){
        System.out.println(hasNose);
    }
    public static void NumberOfEyes(){
        System.out.println(numberOfEyes);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString(*/