package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBookWScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many students do you have:" );
        int students=input.nextInt();
        String[] names = new String[students];
        int [] scores=new int[students];
        String []grade= new String[students];
        String [] questions={"Students name","Students score"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(questions[0]);
            input.nextLine();
            names[i]=input.nextLine();
            System.out.println(questions[1]);
            scores[i]=input.nextInt();
        }
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
