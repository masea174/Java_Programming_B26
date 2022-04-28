package day51_ihneritance.homework.seasons;

public class Summer extends Seasons {

    public Summer( int highestAveTemperature, int lowestAveTemperature) {
        super("Summer", highestAveTemperature, lowestAveTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Drink lemonade");
    }
}
