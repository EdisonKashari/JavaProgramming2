package day_38_inheritancee.Browser;

public class Firefox extends Browser{
    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close firefox browser");
    }
}
