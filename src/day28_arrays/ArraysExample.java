package day28_arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        //with normal variables;
        String cityOne="Chicago";
        String cityTwo="New York";
        String city3="Houston";
        String city4="Denver";
        String city5="Pittsburg";


        //declare array with values:
        String [] cities={"Chicago","New York", "Houston","Denver","Pittsburg"};

        //hoe to access each the element in the array
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        System.out.println("Reverse order of the cities: "+cities[4]+", "+cities[3]+", "+cities[2]+", "+cities[1]+", "+cities[0]);
// print all the array at one time
        System.out.println(cities);// this is invalid give you some location in memory
        System.out.println(Arrays.toString(cities));// this metod from arrays class
// number of elements
        System.out.println(cities.length);
    }
}
