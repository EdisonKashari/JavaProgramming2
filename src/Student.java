import java.util.Arrays;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        // this.name = name;
        this(name);
        this.gender = gender;

    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this(name,studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name,gender);

        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {

        this(name,gender,age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
class StudentObject{

    public static void main(String[] args) {
        day_33_Staticss.Student student1 = new day_33_Staticss.Student("Ahmet");
        day_33_Staticss.Student student2 = new day_33_Staticss.Student("Aygun",'F');
        day_33_Staticss.Student student3 = new day_33_Staticss.Student("Nigara",11);
        day_33_Staticss.Student student4 = new day_33_Staticss.Student("Mert",12,'A');
        day_33_Staticss.Student student5 = new day_33_Staticss.Student("Cihad",'M',28);
        day_33_Staticss.Student student6 = new day_33_Staticss.Student("Suhaib",'M',27,15);
        day_33_Staticss.Student student7= new day_33_Staticss.Student("Ali",'M',42,34,'C');

        System.out.println(student1==student2);

        day_33_Staticss.Student[] students = {student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));
    }
}