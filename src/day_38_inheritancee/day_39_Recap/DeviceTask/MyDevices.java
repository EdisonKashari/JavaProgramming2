package day_38_inheritancee.day_39_Recap.DeviceTask;

public class MyDevices {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone","Iphone 13",1300,true,false);

        Samsung samsung = new Samsung("Samsung","Galaxy",1000,false,true);

        BlackBerry blackBerry = new BlackBerry("BlackBerry","Berry",500,true,true);

        Google google = new Google("Google","Go",680,true,false);

        Nokia nokia = new Nokia("Nokia","3310",120,true,false);

        PersonalComputer personalComputer = new PersonalComputer("Dell","Ultimate",1000,true,false,false);

        Desktop desktop = new Desktop("Lenovo","Le",1500,false,true,true);

        Laptop laptop = new Laptop("HP","Envy",1500,true,true,false);


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(blackBerry);
        System.out.println(google);
        System.out.println(nokia);
        System.out.println(personalComputer);
        System.out.println(desktop);
        System.out.println(laptop);

        iphone.call(254755);
        iphone.turnOff();
        iphone.turnOn();

        samsung.text(25478);
        samsung.turnOn();
        samsung.turnOff();

        blackBerry.text(22478);
        blackBerry.turnOff();
        blackBerry.turnOn();
        blackBerry.died();

        google.call(578414);
        google.turnOff();
        google.turnOn();

        nokia.selfDefense();
        nokia.turnOff();
        nokia.turnOn();

        personalComputer.OS();


        desktop.OS();

        laptop.OS();



    }
}
