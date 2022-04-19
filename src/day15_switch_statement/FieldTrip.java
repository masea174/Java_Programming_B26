package day15_switch_statement;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Insert the grade number:");
        int grade= input.nextInt();
        String location="",
                teacher="";
        int numberOfGroups=0;

        if(grade>0 && grade<7){
            if(grade==1){
                location="Apple Orchard";
                numberOfGroups=3;
                teacher="Ms. Smith";

            }else if(grade==2){
                location="Zoo";
                numberOfGroups=7;
                teacher="Mr.Lee";

            }else if(grade==3){
                location="Aquarium";
                numberOfGroups=5;
                teacher="Ms. Willson";

            }else if(grade==4){
                location="Movie Theatre";
                numberOfGroups=2;
                teacher="Ms. Reyers";

            }else if(grade==5){
                location="Museum";
                numberOfGroups=5;
                teacher="Ms. Lela";

            }else{
                grade=6;
                location="Six Flags";
                numberOfGroups=8;
                teacher="Mr. Watt";
            }
            System.out.println("The trip for the "+grade+" grade will be at : "+location+", number of groups will be "+numberOfGroups+" with the teacher in charge "+teacher);
        }else {
            System.out.println("Grade must be between 1and 6");
        }
    }
}
