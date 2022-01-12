package day_36_Inheritance.Book;

public class EBook extends Book{


    public String size;
    public int pages;

    public  void setInfo(String size, int pages) {
        this.size = size;
        this.pages = pages;
    }
    public void readBook(){
        System.out.println( "I'm reading " + title);
    }

    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}


