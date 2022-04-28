package day51_ihneritance.homework.seasons;

public class Winter extends Seasons {

    public Winter( int highestAveTemperature, int lowestAveTemperature) {
        super("Winter", highestAveTemperature, lowestAveTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
    }
}
