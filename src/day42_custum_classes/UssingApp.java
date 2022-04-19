package day42_custum_classes;

import java.util.Scanner;

public class UssingApp {
    public static void main(String[] args) {
        App cydeo=new App();
        cydeo.name="Cydeo";
        cydeo.version=5.5;
        cydeo.isFree=true;

//        App.run();
//        App.update(); doesnt work

        cydeo.run();
        cydeo.update();
        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println(cydeo);

        new App().run();//creates an object with no reference and calls the run by default it will be null

        System.out.println(new Scanner(System.in).nextLine());// we can use scanner only once there is no reference to access the Scanner we didnt save it as a variable .to call another scanner method we will have to create another scanner object.
    }
}
