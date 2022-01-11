package day_32_Constructors;

public class Address {

    /*
    Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
     */


    public int buildingNumber;
    public String zipCode;
    public String street,city, state;


    public Address(int buildingNumber, String street, String city, String zipCode, String state){
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
    }



    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + "," + zipCode;
    }
}
