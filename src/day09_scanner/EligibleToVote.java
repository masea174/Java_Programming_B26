package day09_scanner;



public class EligibleToVote {
    //create and assign these variables
    //name
    //are they citizen
    //do have criminal background
    //age
    //determinate if thet are eligible to vote
    //only vote if they are citizen above 18 and no criminal record
    //$name is elligble to vote :$boolean
    public static void main(String[] args) {
        String name="Diana";
        boolean haveCitizenship=true;
        int age =19;
        boolean haveCriminalRecord=true;
        boolean eligibleToVote =age>17 && haveCitizenship && !haveCriminalRecord;
        System.out.println("eligibleToVote = " + eligibleToVote);
        System.out.println(name +" is eligible to vote : "+eligibleToVote);



    }

}
