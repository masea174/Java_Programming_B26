package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    //ask the user to give you the temp
    //if the tem >=70 Its a nice day
    //go outside with yor laptop to code Java
    // <70 Its too cold
    //Code Java
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Whats the temperature outside?");
        int temparature=input.nextInt();
        if (temparature>=70){
            System.out.println("It's a nice day");
            System.out.println("Go outside,with your computer tono code Java");
        }else {
            System.out.println("It's cold oustide");
            System.out.println("Code Jave");
        }
    }
}
