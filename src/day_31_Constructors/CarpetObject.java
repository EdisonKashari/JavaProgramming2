package day_31_Constructors;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1 =new Carpet(3.5,5.5,220.5,true);
        Carpet carpet2 =new Carpet(3.5,5.5,220.5,false);

        System.out.println(carpet1);
        System.out.println(carpet2);
    }
}
