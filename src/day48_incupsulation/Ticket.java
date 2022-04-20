package day48_incupsulation;

public class Ticket {
    /*
    Task
        FlightTicket
            instance variables:
                type (first, business, economy)
                departure location
                arrival location

            constructor: initialize all fields
                -> only allow the given ticket types to be set

            encapsulate all the fields
     */
    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public Ticket(String type, String departureLocation, String arrivalLocation) {
        setType(type);
        setDepartureLocation(departureLocation);
        setArrivalLocation(arrivalLocation);
    }

    public void setType(String type) {
        switch (type.toLowerCase()){
            case"first":
            case"business":
            case "economy":
        this.type = type;
    }}

    public String getType() {
        return type;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
}
