package day_33_methods;

public class PositiveNegative {
    /*
      Create a method that will accept a number. Find and print if it is a
      positive number, negative number, or zero
     */
    public static void positivNegativZero(int a){
        if (a==0){
            System.out.println(a+"-It's zero");
        }else if(a<0)
            System.out.println(a+"-It's negative");
        else{
            System.out.println(a+"-It's positive");
        }
    }

    public static void main(String[] args) {
        positivNegativZero(8);
        positivNegativZero(-17);
        positivNegativZero(0);
    }
}
