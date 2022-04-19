package day45_custom_classes;

import java.util.ArrayList;

public class Hobby {
    /*
    create a class called Hobby

        - data:

            name, annual cost, is outdoors (boolean), requires others (boolean)*/
    String name;
    double annualCost;
    boolean isOutdoors;
    boolean requireOthers;
    /*

        - constructor

            - create a constructor that creates a Hobby object with the name

            - create a constructor that creates a Hobby object with the name and annual cost

            - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others
*/

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requireOthers) {
        this(name,annualCost);
        this.isOutdoors = isOutdoors;
        this.requireOthers = requireOthers;
    }
/*
        - method:

            - doIt():
                print: Doing $name-of-hobby $outside-or-inside

            - toString()
                print all the Hobby information
*/

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requireOthers=" + requireOthers +
                '}';
    }
    public void doIt(){
        System.out.println("Doing "+name+((isOutdoors)?" on the fresh air":" inside the building"));
    }
/*
    Create a separate class to create and test the Hobby objects

        - create an java.util.ArrayList of Hobby objects
        - create and add a couple Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
     */
}
