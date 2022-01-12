package day_34_GarbageColletion_AccessModifiers;

public class Cydeo {

    public String name,fieldOfStudy;
    public char gender;
    public int age,batchNumber,groupNumber;
    public static String schoolName,programmingLanguage,secretCode;

    public Cydeo(String name, char gender, int age, int batchNumber, int groupNumber,String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy=fieldOfStudy;
    }

    static {
        schoolName="Cydeo";
      //  fieldOfStudy="Java";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printSecretCode(){
        System.out.println(secretCode);
    }
    public void attendClass(){
        System.out.println(fieldOfStudy);
    }
    public static void study(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "Cydeo{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/* create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()*/