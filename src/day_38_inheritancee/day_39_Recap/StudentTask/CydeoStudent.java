package day_38_inheritancee.day_39_Recap.StudentTask;

public class CydeoStudent extends Student {

    private int batchNumber,groupNumber;
    private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println(batchNumber+" is invalid");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){
            System.err.println(groupNumber+" is invalid");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage==null || programmingLanguage.isEmpty()){
            System.err.println(programmingLanguage+" is invalid");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking "+ programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping with " + getProgrammingLanguage());
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", schoolName='" + getSchoolName() + '\'' +
                ", grade=" + getGrade() +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
 CydeoStudent:

						Extra Variables:
							batchNumber, groupNumber, programmingLanguage

						Encapsulate all the fields

						Add a constructor that can set all the fields

								Condition:
									1. batchNumber and groupNumber should not be set to zero or negative
									2. programmingLanguage should not be set to null
									3. programmingLanguage should not empty
 */