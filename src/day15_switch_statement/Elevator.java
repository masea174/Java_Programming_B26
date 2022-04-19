package day15_switch_statement;

import java.util.Scanner;

public class Elevator {
    /*
    add new class Elevator

declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please insert what level you want elevator to take you to:");
        int floor= input.nextInt();
        String message="";


        switch (floor){
            case 1:
                message="Lobby, StarBucks, Amazon Pick Up";
                break;
            case 2:
                message="NASA, Cydeo, Discover";
                break;
            case 3:
                message="Uber,Lyft, Chase";
                break;
            case 4:
                message="Rooftop ,Lounge";
                break;

        }
        System.out.println(floor+" has "+message);

    }
}
