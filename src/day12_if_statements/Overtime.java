package day12_if_statements;

import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Introduce the rate of pay :");
        double rate= input.nextDouble();
        System.out.println("Introduce the hours worked thru a week :" );
        double hours= input.nextDouble();
        if(hours<=40){
            System.out.println("the net pay is :"+(hours*rate));
        }else {
            System.out.println("the net pay is :"+(hours*rate+(hours-40)*rate*0.5));

        }

    }
}
