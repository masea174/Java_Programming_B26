package day51_ihneritance.homework.seasons;

public class Fall extends Seasons{

    public Fall( int highestAveTemperature, int lowestAveTemperature) {
        super("Fall", highestAveTemperature, lowestAveTemperature);
    }

    @Override
    public void activity() {
        System.out.println("Read a book");
    }
}
