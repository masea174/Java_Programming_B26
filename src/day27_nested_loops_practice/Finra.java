package day27_nested_loops_practice;

import java.util.Scanner;

public class Finra {
    /*
    number
    n% 3 fin
    %5 ra
    both-finra
    neither number
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int stop =input.nextInt();
        for (int i = 1; i <= stop; i++) {
            String str="";
            if (i%3==0){
                str+="FIN";
            }if (i%5==0){
                str+="RA";
            }
            System.out.print((str.isEmpty()?i:str)+" ");
        }
    }
}
