package day_35_Encapsulation.encapsulation;

public class PasswordObject {
    public static void main(String[] args) {
        Credentials credentials1= new Credentials("Edison","hdisodfdf");

        credentials1.setPassword("Edison1990$");

        System.out.println(credentials1);
    }
}
