package day14_practice;

public class FieldTrip {
    /*
    Create a class called FieldTrip.
Your school goes on a Field trip each year. The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip. Print the information at the end.

declare and assign the grade level variable

	only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
		so print: "Grade must be between 1-6"

    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
     */
    public static void main(String[] args) {
        int grade=2,
                numberOfGroups=0;
        String location="",
                teacherInCarge="",
                info="";



        if(grade>=1 &&grade<=6){
            if(grade==1){
                grade= 1;
                location = "Apple orchard";
                numberOfGroups= 3;
                teacherInCarge = "Ms. Smith";

            }else if(grade==2){
                grade = 2;
                location = "Zoo";
                numberOfGroups= 7;
                teacherInCarge =" Mr. Lee";

            }else if(grade==3){
                grade = 3;
                location = " Aquarium";
                numberOfGroups =5;
                teacherInCarge ="Ms. Wilson";
            }else if (grade==4){
                grade = 4;
                location = "Movie theater";
                numberOfGroups = 2;
                teacherInCarge ="Ms. Reyes";
            }else if (grade==5){
                grade =5;
                location= "Museum";
                numberOfGroups =5;
                teacherInCarge ="Ms. Lela";

            }else{
                grade = 6;
                location = "Six Flags";
                numberOfGroups =8;
                teacherInCarge ="Mr. Watt";
            } System.out.println("The "+grade+"grade is going on a trip to "+location+". It will be "+numberOfGroups+" groups of kids that will be watched by "+teacherInCarge);

    }else{
            System.out.println("Invalid data");
            System.out.println("Must be in the grades from 1 to 6");
        }

}

}