package day47_encapsulation;

import java.util.Locale;

public class Pizza {
    /*
    create a class called Pizza

        - data:

            size (String), number of toppings
*/
    String size ;
    int numberOfToppings;

    public Pizza(String size, int numberOfToppings) {
        this.setSize(size);
        this.setNumberOfToppings(numberOfToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        switch (size.toLowerCase()){
            case "small":
            case "medium":
            case "large":
        this.size = size;
    }}

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if(numberOfToppings>0)
        this.numberOfToppings = numberOfToppings;
    }
/*
        - constructor

            - create a constructor that creates a Pizza object with the length and the width

            	call setters here

        - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number

        - other methods methods:
*/public double calculatePrice(String size, int numberOfToppings){
    int price =0;
    switch (size.toLowerCase()){
        case  "small":price+=4;
        break;
        case "medium":price+=6;
        break;
        case "large":price+=8;
    }
    return price+ 0.75*numberOfToppings;

}

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                "." +
                " Total price will be $"+calculatePrice(getSize(),getNumberOfToppings());
    }
/*
            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza
... (осталось: 5 строк)
     */
}
