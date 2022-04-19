package day43_constroctors;

public class Offer {
    /*
     create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO

        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO


        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects
     */
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPTO;
    public Offer(String company,String location){
        this.company=company;
        this.location=location;
    }
    public Offer(String company,String location,double salary){
        this.company=company;
        this.location=location;
        this.salary=salary;
    }

    public Offer(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }
    public String toString(){
        String str= "Offer is from "+company+" at this address: "+location;
        if(salary>0){
            str+= " with this salary: $"+salary+".";
        }str+=(isFullTime)?" Full time job.":" Part time job.";
        if(numberOfPTO>0){
            str+=" With "+numberOfPTO+ " days of PTO. ";
        }
    return str;

}}
