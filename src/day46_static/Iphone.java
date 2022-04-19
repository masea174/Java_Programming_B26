package day46_static;

import day36_methods_overload.SumOfElements;

public class Iphone {
    String model;
    double price;
    static String company;
    static String os;
    static String  day;
    static boolean appleDay;


    public Iphone(String model, double price) {
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.price = price;
    }
    static {
        System.out.println("STATIC BLOCK RUN");
        company ="Apple";
        os="IOS";
        day="Wendnesday";
        if (day.equals("Friday")){
            appleDay=true;
        }
    }
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

}
