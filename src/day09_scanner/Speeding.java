package day09_scanner;

public class Speeding {
    /*
    declare 3 variables:
    current speed, speed limit, speeding boolean

            print
        "Are you speeding? " true/false
    ____________________________________________________________*/

    public static void main(String[] args) {
        int currentSpeed=53;
        int speedLimit=60;
        boolean speeding = currentSpeed>speedLimit;

        System.out.println("are you speeding ?"+speeding);
    }

}
