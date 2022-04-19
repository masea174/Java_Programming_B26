package day44_costum_classes;

public class OfferV2 {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTOs;

    public OfferV2(String location, String company) {
        this.location = location;
        this.company = company;
    }

    public OfferV2(String location, String company, double salary) {
        this(location,company);
        this.salary = salary;
    }

    public OfferV2(String location, String company, double salary, boolean isFullTime, int numberOfPTOs) {
        this(company,location,salary);
        this.isFullTime = isFullTime;
        this.numberOfPTOs = numberOfPTOs;
    }

    @Override
    public String toString() {
        String str="Offer " +
                "\nlocation='" + location +
                "\n company='" + company ;
        str+="\n"+(salary>0?salary+"$":"");
        str+= "\n"+(isFullTime?"Fulltime":"Contract");
        str+="\n"+(numberOfPTOs>0?numberOfPTOs+ " off days":"");
        return str;
    }

}
