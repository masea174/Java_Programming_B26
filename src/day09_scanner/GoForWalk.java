package day09_scanner;

public class GoForWalk {
    // we want to a walk
    // we will go if is not raining ans weather is about 70 there is no need to check if is raining

    public static void main(String[] args) {
        boolean isItRaining= false;
        int temperature=60;

        System.out.println(!isItRaining && temperature > 70);
    }
}
