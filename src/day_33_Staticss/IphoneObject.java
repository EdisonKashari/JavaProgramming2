package day_33_Staticss;

public class IphoneObject {
    public static void main(String[] args) {
        IPhone iPhone1= new IPhone("iPhone 13","White",1300,10.5);
        iPhone1.faceTime("edisonkashari@hot.mail");
        iPhone1.faceTime(862703930);
        iPhone1.call(587458789);
        iPhone1.text(874589554);
        System.out.println(iPhone1);
    }
}
