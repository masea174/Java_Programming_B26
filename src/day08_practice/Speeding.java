package day08_practice;

public class Speeding {
//    create a class called Speeding, and write a program to determine if the car is speeding
//
//    declare 3 variables:
//    current speed, speed limit, speeding boolean
//
//            print
//        "Are you speeding? " true/false
 //   _________________________________________
public static void main(String[] args) {
    int speed=90;
    int speedLimit=70;
    boolean AreYouSpeeding=speed>speedLimit;

    System.out.println("Are you speeding ?"+AreYouSpeeding);
    int R = 20;
    int W = -R-- + -R++ + --R * R-- % 2;
    System.out.println(R);
    System.out.println(W);
    int M = 30;
    int N = 400;
    int U = ++M + N++ - M-- % 2 + --N % 2;
    System.out.println(M);
    System.out.println(N);
    System.out.println(U);
}
}
