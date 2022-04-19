package day14_practice;

public class Minutes {
    /*
    declare and assign a minutes variable
use the minutes value to determine how much time is left in the soccer
game
use these ranges to determine the outputs:
- any number less than 0 and more than 90 are not valid:
when the minutes is less than 0:
print: minutes cannot be a negative number
when the minutes is more than 90:
print: games cannot be longer than 90 minutes
- when the minutes are between 90 - 75
print: just getting started
- when the minutes are between 74 - 60
print: players are doing their best
- when the minutes are between 59 - 30
print: middle of the game is going great
- when the minutes are between 29 - 0
print: the end of the same is approaching
     */
    public static void main(String[] args) {
        int minutes=98;
        String message="";

        if (minutes>0 && minutes<=90){
            if(minutes<=90 && minutes>74){
                message="just getting started";
            }else if(minutes>59){
                message="players are doing their best";
            }else if(minutes>29){
                message="midle of the game is going great";
            }else {
                message="the end of the game is approaching";
            }
            System.out.println(message);
        }else{
            System.out.println("Entry not valid");
            if (minutes<0){
                System.out.println("minutes can not be a negative number");
            }else {
                System.out.println("game cannot be longer than 90 minutes");
            }
        }
    }
}
