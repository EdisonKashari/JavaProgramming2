package day_36_Inheritance.Book;

public class AudioBook {

    public double length;
    public String narrator;

    public void setInfo(double length, String narrator) {
        this.length = length;
        this.narrator = narrator;
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
