package day13_if_condition;

public class Diver {
    /*You are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
    Above 70 - Don't go too far
    Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%*/
    public static void main(String[] args) {

        int air=80;

        if (air>90){
            System.out.println("your tank is full");
        }else if(air>80){
            System.out.println("Still okay");
        }else if (air >70) {
            System.out.println("Don't go to far");
        }else if (air>60){
            System.out.println("Start to head back");
        }else if (air>50){
            System.out.println("be careful now you are at 50%");
        }
        System.out.println("----------------------------");

        String message;if (air>90){
            message=("your tank is full");
        }else if(air>80){
            message=("Still okay");
        }else if (air >70) {
           message=("Don't go to far");
        }else if (air>60){
            message=("Start to head back");
        }else if (air>50){
            message=("be careful now you are at 50%");
        }else{
            message="Dangerous";
        }
        System.out.println(message);
    }
}
