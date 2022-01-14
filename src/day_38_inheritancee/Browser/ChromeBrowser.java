package day_38_inheritancee.Browser;

public class ChromeBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }
}
