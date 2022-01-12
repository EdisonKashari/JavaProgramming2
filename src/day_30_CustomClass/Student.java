package day_30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int id;
    public char grade;
// to set the atribute
    public void setInfo(String name, char gender, int age, int id, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.grade = grade;
    }
//four action
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void code(){
        System.out.println(name+" is coding");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
/*   Attributes:
        name, gender, age, studentID

    Actions:
        eat(), sleep(), drink(), code()
        setInfo(): to set all the attributes of student object
        toString(): to print the full info of student  */