package day_45_Abstraction.Browser;

public class DriverObject {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver("Google Chrome");
        FireFoxDriver fireFoxDriver = new FireFoxDriver("Firefox");
        EdgeDriver edgeDriver = new EdgeDriver("Edge");
        OperaDriver operaDriver = new OperaDriver("Opera");
        SafariDriver safariDriver = new SafariDriver("Safari");

        System.out.println(chromeDriver);
        System.out.println(fireFoxDriver);
        System.out.println(edgeDriver);
        System.out.println(operaDriver);
        System.out.println(safariDriver);
        chromeDriver.get("https://learn.cybertekschool.com/?mn=oMo4A-LzqkXtqbgPNIjuS-xvgpMfeDoDKyw.C4HeBi_-2vYwNKW4");
        chromeDriver.close();




    }
}
