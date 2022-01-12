package day_33_Statics.day_33_Statics;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Ali",40,'M');
        person1.eat();
        person1.sleep();
        person1.drink();
        person1.isIsHuman();
        person1.HasNose();

        System.out.println(person1);
    }
}
