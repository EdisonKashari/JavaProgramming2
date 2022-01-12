package day_05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Alan",
         buildingNumber = "524B",
         streetname = "Main st",
         city = "Lodi",
         state = "NJ",
         zipcode = "7644B";

        String addres = name + "\n" + buildingNumber + " " + streetname + "\n" + city +", " + state +" " + zipcode ;

        System.out.println(addres);


/*      String name = "Alan";
        String buildingNumber = "524B";
        String streetname = "Main st";
         String city = "Lodi";
         String state = "NJ";
         String zipcode = "7644B"; */


    }
}
/*Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address */
