package day51_ihneritance.homework.seasons;

public class Seasons {
    /*
    Create a class Season

	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()

		override activity in sub classes

Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace

Create a class Summer

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Drink Lemonade

Create a class Fall

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Read A Book

Create a class Spring

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Go Outside

Create a class CheckSeason

	create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

	List the is a relations of all the classes

     */
    String name;
    int highestAveTemperature;
    int lowestAveTemperature;
    public void activity(){
        System.out.println("walking in "+name);
    }

    public Seasons(String name, int highestAveTemperature, int lowestAveTemperature) {
        this.name = name;
        this.highestAveTemperature = highestAveTemperature;
        this.lowestAveTemperature = lowestAveTemperature;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "name='" + name + '\'' +
                ", highestAveTemperature=" + highestAveTemperature +
                ", lowestAveTemperature=" + lowestAveTemperature +
                '}';
    }
}
