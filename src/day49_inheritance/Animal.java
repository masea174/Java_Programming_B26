package day49_inheritance;

public class Animal {
    String species;
    int numberOfLegs;

    public Animal() {

    }

    public void walk(){
        System.out.println( species+" is walking");
    }




    public Animal(String species) {

        this.species = species;
    }

    public Animal(String species, int numberOfLegs) {
        this(species);
        this.numberOfLegs = numberOfLegs;
    }
}

