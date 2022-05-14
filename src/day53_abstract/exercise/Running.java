package day53_abstract.exercise;

public class Running extends Exercise {
    @Override
    public void performExercise() {
        System.out.println("Running for fun, not sure who does this");
    }

    @Override
    public int getCaloriesBurned(int min) {
        return min*5;
    }

    public Running() {
        super("Running");
    }
}
