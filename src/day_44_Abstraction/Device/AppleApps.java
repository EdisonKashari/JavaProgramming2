package day_44_Abstraction.Device;

public interface AppleApps extends Downloadable{

    String appStoreName = " Apple Store";
    String oS = "IOS";

    @Override
    void downloadAPP();
}
