package day08_relational_operations;

public class AgeGroup {
    public static void main(String[] args) {
        //declare ans asign an age variable
        //is the person a kid (up to 13 ,include 13)
        //is the persona a senior(65 and above

        int age=67;
        boolean isHeAKid=age<=13,
                IsHeASenior=age>=65;

        System.out.println("isHeAKid = " + isHeAKid);
        System.out.println("IsHeASenior = " + IsHeASenior);


    }
}
