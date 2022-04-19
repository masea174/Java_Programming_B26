package day15_switch_statement;

import java.lang.invoke.SwitchPoint;

public class NumberWords {
    /*
    take  a number and print is a word
    1-one
    2-two
     */
    public static void main(String[] args) {

        int n=7;
        if (n==1){
            System.out.println("one");
        }else if(n==2){
            System.out.println("two");
        }else if (n==3){
            System.out.println("three");
        }else if(n==4){
            System.out.println("four");
        }else if(n==5){
            System.out.println("five");
        }else{
            System.out.println("invalid number");
        }
        //switch statement:

        switch (n){
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5 :
                System.out.println("five");
                break;
            default:
                System.out.println("wrong number case closed");
                break;
        }

    }

}
