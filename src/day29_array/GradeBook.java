package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBook {
    /*
    Gradebook
Declare three arrays:
1. String array which will hold names for the students (give values)
2. Int array which has the score of the student got in the quiz (give values)
3. Char array which will have some letter grade based on the score (empty)
4. Output the gradebook at the end with all the information
Grade scale:
Above 85: A
Above 75: B
Above 65: C
Other: D
Challenge: Accept all the
information with Scanner
     */
    public static void main(String[] args) {
        String[] names = {"Mike", "Joe", "Ana", "Ali", "Joanna"};// names
        int [] scores={80, 54, 100, 66, 94};// score
        String []grade= new String[names.length];// grade
        for (int i = 0; i < names.length; i++) {
           if(scores[i]>0 && scores[i]<101){
            if (scores[i]>85) {
                grade[i]="A";
            }else if (scores[i]>75){
                grade[i]="B";
            }else if(scores[i]>65){
                grade[i]="C";
            }else {
                grade[i]="D";
            }}else {
               System.out.println("not a valid entry");
           }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" | "+scores[i]+" | "+grade[i]);
        }


    }
}
