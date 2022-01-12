package day_33_Statics.day_33_Statics;

public class Address {
public int zipCode;
public String street,city,state;
public static String country="USA",planet = "EARTH";

    public String toString() {
        return "Address{" +
                "zipCode=" + zipCode +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Address(int zipCode, String street, String city, String state) {
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;




    }
}
/* Address Task:
		1. Create a class named Address:

		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet

	        Add a constructor that can set All the fields (instances)

		    Actions
		            setInfo: sets all the instances
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012*/