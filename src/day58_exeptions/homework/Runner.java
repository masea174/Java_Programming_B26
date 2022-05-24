package day58_exeptions.homework;

import day58_exeptions.bank.InvalidCredentialsException;

public class Runner {
    /*

Create a class Runner

    create an object of the Pen and try to call both methods. Handle any Exceptions you need to
     */
    public static void main(String[] args) {
        Pen pen= new Pen();

        pen.inkColor="blue";
        pen.inkLevel=45;
        try {

            pen.changeColor("purple");
        } catch (InvalidColorException e) {
            e.getMessage();
        }
        pen.write();
        System.out.println(pen.inkLevel);
        System.out.println(pen.inkColor);
        pen.write();
        pen.write();
        pen.write();
        pen.write();


    }
}
