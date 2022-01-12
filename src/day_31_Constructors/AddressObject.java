package day_31_Constructors;

public class AddressObject {
    public static void main(String[] args) {
        Address address1 = new Address(7925,"Jones Branch Dr","McLean","Va",22012);

        System.out.println(address1);
    }
}
/*Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012*/