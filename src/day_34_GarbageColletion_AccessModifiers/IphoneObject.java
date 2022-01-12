package day_34_GarbageColletion_AccessModifiers;

public class IphoneObject {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Iphone13","White",1250,12.5);
        iphone1.call(56270354);
        iphone1.faceTime(45784);
        iphone1.printOperatingSystem();
        iphone1.faceTime("edison@hotmail.com");

        System.out.println(iphone1);
    }
}
