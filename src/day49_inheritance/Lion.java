package day49_inheritance;

public class Lion extends Animal{
    public Lion(String species, int numberOfLegs) {
        super(species, numberOfLegs);
    }

    public void roar(){
        int maneSize;
        System.out.println("Lion is roaring");
    }
}
