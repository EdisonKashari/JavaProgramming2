package day_37_Inheritance.AnimalTask;

public class Dog extends  Animal{




    public Dog(String name, String breed, int age, char gender, String size, String color){
        super(name,breed,age,gender,size,color);


    }

    public void bark(){

        System.out.println(name+" is barking");


    }


}

