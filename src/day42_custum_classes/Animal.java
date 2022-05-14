package day42_custum_classes;

public class Animal {
    String species;
    long population;

    public String toString() {
        String print = "Species: " + species;
        print += "\nPopulation: " + population;
        return print;
    }

}
