package day51_ihneritance.homework.seasons;

public class Spring extends Seasons{

    public Spring( int highestAveTemperature, int lowestAveTemperature) {

        super("Spring", highestAveTemperature, lowestAveTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Go outside");
    }
}
