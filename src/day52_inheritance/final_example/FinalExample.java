package day52_inheritance.final_example;

public final class FinalExample {

    final int a=5;

    final int b;

    public static final String PLANET="Earth";

    public FinalExample(int b){
        this.b=b;// the final variable b was not hard coded but every time when a object will be created it will  have this variable that in the future will not be changed

    }

}
