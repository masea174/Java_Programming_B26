package day09_scanner;

public class Discount {
    public static void main(String[] args) {


    //get discount if its friday ,you are a teachea ,police oficer ,or firefighter

    boolean isFriday = true;
    boolean teacher = true,
            firefighter = false,
            policeofficer = false,
            millitary = false;

        boolean discount=firefighter||teacher||policeofficer||millitary;
        boolean fridayDiscount=discount&&isFriday;
        boolean getDiscount= teacher||firefighter||policeofficer||millitary && isFriday;

        System.out.println("are we getting discount: "+fridayDiscount);




       System.out.println(getDiscount);



    }



}


