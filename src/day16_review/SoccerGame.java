package day16_review;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {
        Scanner net=new Scanner(System.in);
        System.out.println("how many minutes are left");
        int minutes= net.nextInt();
        String message="";
        if(minutes>0 && minutes<90){
            if(minutes>74){
                message="just getting started";
            }else if(minutes>59){
                message="players are doing their best";
            }else if (minutes>29){
                message="middle of the game is going great";
            }else {
                message="end of the game is aprocing";
            }
        }else{if (minutes<0){
            message="minutes cant be negative";
        }else{
            message="Game cannot be longar than 90 min";
        }

        }System.out.println(message);
    }
}
