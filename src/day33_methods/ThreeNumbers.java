package day33_methods;

public class ThreeNumbers {
    /*
    reate a method that will that accepts three numbers. Check if the three
numbers equal to 180.
If they are equal to 180 print: "This is a triangle"
If they are equal to 360 print: "This is a circle"
     */
    public static void threeNumbers(int a,int b , int c){
        int sum =a+b+c;
        if(sum==180){
            System.out.println(a+"+"+b+"+"+c+" forms a triangle");
        }else if(sum==360){
            System.out.println(a+"+"+b+"+"+c+" forms a circle");
        }else{
            System.out.println("No shape found");
        }
    }

    public static void main(String[] args) {
        threeNumbers(10,60,110);
        threeNumbers(180,90,90);
        threeNumbers( 10,20,27);
        }
    }

