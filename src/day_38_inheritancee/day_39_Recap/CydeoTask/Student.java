package day_38_inheritancee.day_39_Recap.CydeoTask;

public class Student extends Person{

    private int studentId;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
       setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void getFieldOfStudy() {
        System.out.println(getName() + " is studying java");
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String study(){
        return getName()+" is studying";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
