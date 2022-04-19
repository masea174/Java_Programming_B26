package day43_constroctors;

public class Address {
    String street;
    String city;
    String state;
    String zipcode;
    //This is what we used to do
//    public Address(String inputStreet,String inputCity,String inputState, String inputZipcode){
//        state=inputState;
//        street=inputStreet;
//        city=inputCity;
//        zipcode=inputZipcode;
//    }
    public Address(String street,String city,String state, String zipcode){
        this.street=street;
        this.zipcode=zipcode;
        this.city=city;
        this.state=state;
    }
}
