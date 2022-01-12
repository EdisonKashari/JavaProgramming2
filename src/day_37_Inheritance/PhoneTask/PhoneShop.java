package day_37_Inheritance.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("ProMax",1200,"Medium","White");

        System.out.println(iphone1);

        Samsung samsung1 = new Samsung("GalaxyS10",650,"Medium","White");

        System.out.println(samsung1);



        Nokia nokia1 = new Nokia("Brick",50,"4 inches","Black");



        System.out.println(nokia1);


        iphone1.faceTime("Edison@hotmail.com");
        iphone1.faceTime(2545787);

        samsung1.freeze();
        samsung1.call(911);
        samsung1.text(12345678);

        nokia1.selfDefense();
        nokia1.call(1234547);
        nokia1.text(147258369);
    }
}
