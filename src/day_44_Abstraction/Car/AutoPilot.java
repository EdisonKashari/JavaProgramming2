package day_44_Abstraction.Car;

public interface AutoPilot extends AutoPark{
    @Override
    void autoPark();
    boolean hasAutoPilot = true;

    void selfDrive();

}
