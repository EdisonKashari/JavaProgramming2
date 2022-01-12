package day_36_Inheritance.Phone;

public class PhoneObject {
    public static void main(String[] args) {
        Iphone iphone= new Iphone();
        iphone.setInfo("Iphone","Iphone13","white","small",1300);
        iphone.faceTime(545456);
        iphone.faceTime("gmail");

        System.out.println(iphone);

        Samsung samsung = new Samsung();

        samsung.setInfo("Samsung","Galaxy","Black","Medium",1050);

        samsung.freeze();
        samsung.call(45655456);
        samsung.text(655565);

        System.out.println(samsung);

        Nokia nokia1 =new Nokia();

        nokia1.setInfo("Nokia","Nokia3310","Blue","large",300);

        nokia1.selfDefense();
        nokia1.text(55459);
        nokia1.call(862703);

        System.out.println(nokia1);


    }
}
