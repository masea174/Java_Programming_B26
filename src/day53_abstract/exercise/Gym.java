package day53_abstract.exercise;

public class Gym {
    public static void main(String[] args) {
       // Exercise obj1=new Exercise("");
        //cant create an object because my class is abstract.

        Running obj=new Running();
        obj.performExercise();
        System.out.println(obj.getCaloriesBurned(30));
    }
}
