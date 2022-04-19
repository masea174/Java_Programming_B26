package day27_nested_loops_practice;

public class PrimeRange {
    public static void main(String[] args) {

    int range=50;
        for (int i = 2; i < range; i++) {       //the purpose of this loop is to check all the numbers from 2 to the value of range variable
            int count =0;                       // putting the counter inside of the outer loo[ will reset it bac to 0 for the next number
            for (int j = 2; j <i && count==0; j++) {
                if (i%j==0){
                    count++;
                }
            }if (count==0){
                System.out.print(i+", ");
            }
        }
}}
