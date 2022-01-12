package day_35_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person();
      //  person1.getName();
        person1.setName("Edison");
      //  person1.getAge();
        person1.setAge(35);

        System.out.println(person1.getAge()+" "+person1.getName());
    }
}
